MyMovies API
Obtain an API key for The Movie DB API.
Implement the API calls in the oas.json file by forwarding these calls to the corresponding MovieDB endpoint.
Allow authenticated calls using Basic Authentication against a JDBC data source.
Enrich the /api/movie/{movie_id} endpoint to store and retrieve favorite status, notes and personal rating. This endpoint should allow both the GET and PATCH methods to read and set/update the extended data.
favorite: boolean
personal_rating: integer (0-5)
notes: varchar(255)
Cache retrieved data using Pivotal Gemfire.
