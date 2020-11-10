package model;

//サイト評価に関する処理を行うモデル
/*使用用途：コントローラMinatoIndexx.javaがセッションスコープに保存されているSiteEVの
よいね、よくないねの数をふやす時に使用する */
public class SiteEVLogic {

	//よいねを押したときの処理
	public void like(SiteEV site) {
		int count = site.getLike();
		site.setLike(count + 1);
	}

	//よくないねを押したときの処理
	public void dislike(SiteEV site) {
		int count = site.getDislike();
		site.setDislike(count + 1);
	}

}
