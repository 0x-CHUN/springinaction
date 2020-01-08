package knight;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest(); //紧耦合
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
