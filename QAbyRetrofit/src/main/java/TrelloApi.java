import retrofit2.Call;
import retrofit2.http.*;

public interface TrelloApi {
//CLASSWORK
@POST("/1/boards/")
    Call<Board> createBoard (@Body Board board, @Query("name") String name);
/* @PUT("/1/boards/{id}")
   Call<Board> updateBoard(@Body Board board, @Path("id") String id);
    //"id":"5e989b675a2123106d7d3165"
@DELETE("/1/boards/{id}")
Call<Board> deleteBoard(@Path("id") String id,
                        @Query("key") String key,
                        @Query("token") String token);      */


    //HOMEWORK
    @POST("/1/boards/{id}/lists")
    Call<Board>createList (@Body Board board,
                           @Path("id") String id,
                           @Query("name") String nameList);
    @POST("/1/cards/")
    Call<Board> createCard (@Body Board board,
                            @Query("idList") String idList,
                            @Query("name") String cardName);
    @PUT ("/1/cards/{id}")
    Call<Board> updateCard (@Body Board board,
                            @Path("id") String id,
                            @Query("name") String cardName);
    @GET("/1/cards/{id}")
    Call<Board> getCard (@Path("id") String id,
                         @Query("key") String key,
                         @Query("token") String token);
    @DELETE("/1/cards/{id}")
    Call<Board> deleteCard (@Path("id") String id,
                            @Query("key") String key,
                            @Query("token") String token);
}
