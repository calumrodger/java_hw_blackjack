public class Card {

    private CardSuitType suitType;
    private CardValueType valueType;
    private int value;

    public Card(CardSuitType suitType, CardValueType valueType, int value) {
        this.suitType = suitType;
        this.valueType = valueType;
        this.value = value;
    }

    public CardSuitType getSuitType() {
        return suitType;
    }

    public void setSuitType(CardSuitType suitType) {
        this.suitType = suitType;
    }

    public CardValueType getValueType() {
        return valueType;
    }

    public void setValueType(CardValueType valueType) {
        this.valueType = valueType;
    }

    public int getValue() {
        return value;
    }

}
