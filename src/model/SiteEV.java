package model;

import java.io.Serializable;

//サイト評価に関する情報を持つJavaBeans⇒よいねとよくないねの数を持つ
public class SiteEV implements Serializable {
	private int like;		//よいねの数
	private int dislike;	//よくないねの数

	public SiteEV() {
		this.like = 0;
		this.dislike = 0;
	}

	public void setLike(int like) { this.like = like; }
	public int getLike() { return this.like; }

	public void setDislike(int dislike) { this.dislike = dislike; }
	public int getDislike() { return this.dislike; }


}
