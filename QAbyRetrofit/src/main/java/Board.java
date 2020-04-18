public class Board {

    private String id;
    private String name;
    private String key = "628dd173434cefdc657b6a632f852578";
    private String token = "da633b56afbfdf684c7060a82d1915de84335fd329076313f4b56000a7ba84f1";
    private String cardId;
    private String cardName;
    private String idList;
    private String nameList;

    public String getKey() {
        return key;
    }
    public String getToken() {
        return token;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public String getNameList() {
        return nameList;
    }
    public void setNameList(String nameList) {
        this.nameList = nameList;
    }
}
