package ohm.softa.a08.services;

import com.google.gson.Gson;
import ohm.softa.a08.api.OpenMensaAPI;
import ohm.softa.a08.model.Meal;
import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.converter.gson.GsonConverterFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class OpenMensaAPIService implements OpenMensaAPI {
	private static OpenMensaAPIService ourInstance = new OpenMensaAPIService();

	private static OpenMensaAPI mensaApiInstance;
	private static Gson gson;
	private static DateFormat openMensaDateFormat;

	public static OpenMensaAPIService getInstance() {
		return ourInstance;
	}

	private OpenMensaAPIService() {
		openMensaDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		gson = new Gson();
		var retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create(gson))
			.baseUrl("http://openmensa.org/api/v2/")
			.build();
		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
	}

	@Override
	public Call<List<Meal>> getMeals(String date) {
		return mensaApiInstance.getMeals(openMensaDateFormat.format(new Date()));
	}
}
