package baseballteam;

public class Review03 {

    public static void main(String[] args) {
        // BaseBallTeamのインスタンスを6個生成
        BaseBallTeam YS = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam Y = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam HT = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam YG = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam C = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam D = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        
        YS.report();
        Y.report();
        HT.report();
        YG.report();
        C.report();
        D.report();
    }

}
