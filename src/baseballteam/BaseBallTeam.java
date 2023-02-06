package baseballteam;

public class BaseBallTeam {

    //フィールド
    private String name;// チーム名
    private int win;// 勝ち
    private int lose;// 負け
    private int draw;// 負け
    
    // 引数なしのコンストラクタ（念のため記述しただけなので中身は空）
    public BaseBallTeam() {        
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;

    }
    
    // 勝率を計算するメソッド（引数には・・・を指定）
    public double getRate() {
        return (double) this.win / (this.win + this.lose);
    }
    // 表示
    public void report() {
        System.out.println( name + " の2022年の成績は" + win + "勝" + lose + "敗" + draw + "　勝率は　" + getRate()+ "です。");

    }


}

