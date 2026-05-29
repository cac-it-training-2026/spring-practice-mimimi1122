package jp.co.sss.practice.p05.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")
public class FruitsSeason {
	//主キー
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruits_season_gen")
	@SequenceGenerator(name = "seq_fruits_season_gen", sequenceName = "seq_fruits_season", allocationSize = 1)
	private Integer fruitId;

	@Column
	private String fruitName;
	@Column
	private Integer seasonMonth;

	public Integer getFruitsId() {
		return fruitId;
	}

	public void setFruitsId(Integer fruitsId) {
		this.fruitId = fruitsId;
	}

	public String getFruitsName() {
		return fruitName;
	}

	public void setFruitsName(String fruitsName) {
		this.fruitName = fruitsName;
	}

	public Integer getSeasonMonth() {
		return seasonMonth;
	}

	public void setSeasonMonth(Integer seasonMonth) {
		this.seasonMonth = seasonMonth;
	}
}
