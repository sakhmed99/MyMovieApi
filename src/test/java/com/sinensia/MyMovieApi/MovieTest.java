package com.sinensia.MyMovieApi;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;

import com.sinensia.MyMovieApi.Service.MovieService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class MovieTest {
	
	@Autowired
	private MockMvc mvc;
	
	 @MockBean
	 MovieService movieService;
	 
	 
	 //Get All genres
	 @Test
		public void getAllGenres() throws Exception {
			mvc.perform(MockMvcRequestBuilders.get("/api/genre/movie/list").accept(MediaType.APPLICATION_JSON)).andDo(print())
					.andExpect(status().isOk());
		}
	 
	// get Movie by ID
	 /*
	  
		@Test
		public void getById() throws Exception {
			mvc.perform(MockMvcRequestBuilders.get("/api/movie/550").accept(MediaType.APPLICATION_JSON))
					.andDo(print()).andExpect(status().isOk());

		}
		*/
		
		
	 //Top Rated
		 @Test
			public void getTopRated() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/top_rated").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 
		 //Get Initial Config
		 @Test
			public void getConfig() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/configuration").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 //Popular
		 @Test
			public void getPopular() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/popular").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 //Images
		 @Test
			public void getImages() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/550/images").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 //Keywords
		 @Test
			public void getKeyWords() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/550/keywords").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 //Similar Movies
		 @Test
			public void getSimilar() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/550/similar").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
		 //Get Recommendations
		 @Test
			public void getRecommendations() throws Exception {
				mvc.perform(MockMvcRequestBuilders.get("/api/movie/550/recommendations").accept(MediaType.APPLICATION_JSON)).andDo(print())
						.andExpect(status().isOk());
			}
		 
}
