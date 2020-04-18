import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TrelloTest {
    private String boardId;
    private String idList;
    private String cardId;

        @Test (priority = 1)
        public void checkCreateBoard() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            String name = "Slava First";
            Board createdBoard = retrofitBuilder.getTrelloApi().createBoard(board, name).execute().body();
            boardId = createdBoard.getId();
            Assert.assertEquals(createdBoard.getName(),name);
    }
        @Test(priority = 2)
        public void checkCreateList() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            String nameList = "First List";
            Board createdList = retrofitBuilder.getTrelloApi().createList(board, boardId, nameList).execute().body();
            idList = createdList.getId();
           Assert.assertEquals(createdList.getName(), nameList);
        }
        @Test(priority = 3)
        public void checkCreateCard() throws IOException, InterruptedException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            String cardName = "New Card First";
            Board createdCard = retrofitBuilder.getTrelloApi().createCard(board, idList,cardName).execute().body();
            cardId = createdCard.getId();
            Assert.assertEquals(createdCard.getName(), cardName);
        }
        @Test (priority = 4)
         public void checkUpdateCard() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            String updatedCardName = "OMG! It finally works!!";
            board.setCardName(updatedCardName);
            Board updatedCard = retrofitBuilder.getTrelloApi().updateCard(board,cardId,updatedCardName).execute().body();
            Assert.assertEquals(updatedCard.getName(),updatedCardName);
        }
        @Test(priority = 5)
        public void checkDeleteCard() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            int code = retrofitBuilder.getTrelloApi().deleteCard(cardId, board.getKey(), board.getToken()).execute().code();
            Assert.assertEquals(code, 200);
        }
        @Test (priority = 6)
         public void checkGetCard() throws IOException {
            RetrofitBuilder retrofitBuilder = new RetrofitBuilder();
            Board board = new Board();
            int code = retrofitBuilder.getTrelloApi().getCard(cardId, board.getKey(), board.getToken()).execute().code();
            Assert.assertEquals(code, 404);
        }
