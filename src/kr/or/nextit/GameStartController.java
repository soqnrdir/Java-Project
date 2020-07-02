package kr.or.nextit;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameStartController implements Initializable {
	private int slimeTotHp = 100;
	private int playerTotHp = 100;
	private int temp;
	private int cnt = 0;
	private Image knife;
	private Image axe;
	private Image slime1;
	private Image fire;
	private Image shield;
	private Image potion;
	private Image spitting;
	private Image critical;
	private Image attack;
	private Image vsFight;
	private Image ultimate;
	@FXML
	ImageView selectWappon;
	@FXML
	ImageView slimeLevel1;
	@FXML
	Label slime1Name;
	@FXML
	Label slimeHp;
	@FXML
	Button attackButton;
	@FXML
	Button defenseButton;
	@FXML
	AnchorPane gamePane;
	@FXML
	Label player;
	@FXML
	Label playerDamaged;
	@FXML
	Label slimeDamaged;
	@FXML
	Label playerHp;
	@FXML
	Button fightButton;
	@FXML
	Button resultButton;
	@FXML
	ImageView animationImage;
	@FXML
	Button nextStageButton;
	@FXML
	Button restartButton;
	@FXML
	Button knifeButton;
	@FXML
	Button axeButton;
	@FXML
	Label selectLabel;
	@FXML
	Label vsLabel1;
	@FXML
	Label vsLabel2;
	private Optional<ButtonType> wait;
	private MediaPlayer startVs;
	private MediaPlayer selectedWappon;
	private MediaPlayer success;
	private MediaPlayer fail;
	private MediaPlayer attackDefalut;
	private MediaPlayer fireAttack;
	private MediaPlayer waterAttack;
	private MediaPlayer miss;
	private MediaPlayer criticalAttack;
	private MediaPlayer nextPage;
	private MediaPlayer healing;
	private MediaPlayer ultimateAttack;
	private Media media;
	private Media media2;
	private Media media3;
	private Media media4;
	private Media media5;
	private TranslateTransition transition;
	private TranslateTransition transition2;
	@FXML
	Button healPButton;
	@FXML
	Button specialButton;
	@FXML
	Button defaultAttakBt;
	@FXML
	Button ultimateButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		knife = new Image(getClass().getResource("images/knife.png").toExternalForm());
		axe = new Image(getClass().getResource("images/axe.png").toExternalForm());
		slime1 = new Image(getClass().getResource("images/waterSlime.png").toExternalForm());
		fire = new Image(getClass().getResource("images/fire.png").toExternalForm());
		shield = new Image(getClass().getResource("images/shield.png").toExternalForm());
		potion = new Image(getClass().getResource("images/potion.png").toExternalForm());
		spitting = new Image(getClass().getResource("images/spitting.png").toExternalForm());
		critical = new Image(getClass().getResource("images/critical.png").toExternalForm());
		attack = new Image(getClass().getResource("images/attack.png").toExternalForm());
		vsFight = new Image(getClass().getResource("images/vsFight.png").toExternalForm());
		ultimate = new Image(getClass().getResource("images/ultimate.png").toExternalForm());

		String path = "/home/pc16/Desktop/프로젝트mp3/startVs.mp3";
		String path2 = "/home/pc16/Desktop/프로젝트mp3/selectWappon.mp3";
		String path3 = "/home/pc16/Desktop/프로젝트mp3/Tada.mp3";
		String path4 = "/home/pc16/Desktop/프로젝트mp3/fail.mp3";
		String path5 = "/home/pc16/Desktop/프로젝트mp3/nextPage.mp3";

		media = new Media(new File(path).toURI().toString());
		media2 = new Media(new File(path2).toURI().toString());
		media3 = new Media(new File(path3).toURI().toString());
		media4 = new Media(new File(path4).toURI().toString());
		media5 = new Media(new File(path5).toURI().toString());

		startVs = new MediaPlayer(media);
		selectedWappon = new MediaPlayer(media2);
		success = new MediaPlayer(media3);
		fail = new MediaPlayer(media4);
		nextPage = new MediaPlayer(media5);
	}

	@FXML
	public void knifeClick() {
		selectLabel.setText("칼을 선택하셨습니다.");
		wait = new Alert(AlertType.CONFIRMATION, "검을 선택하시겠습니까?.", ButtonType.NO, ButtonType.YES).showAndWait();
		if (wait.get() == ButtonType.YES) {
			selectedWappon.play();
			knifeButton.setDisable(true);
			axeButton.setDisable(true);
			selectWappon.setImage(knife);
		} else {
			selectLabel.setText("다시 선택해주세요!");
		}
		fightButton.setDisable(false);
	}

	@FXML
	public void axeClick() {
		selectLabel.setText("도끼를 선택하셨습니다.");
		wait = new Alert(AlertType.CONFIRMATION, "도끼를 선택하시겠습니까?.", ButtonType.NO, ButtonType.YES).showAndWait();
		if (wait.get() == ButtonType.YES) {
			selectedWappon.play();
			knifeButton.setDisable(true);
			axeButton.setDisable(true);
			selectWappon.setImage(axe);
		} else {
			selectLabel.setText("다시 선택해주세요!");
		}
		fightButton.setDisable(false);
	}

	@FXML
	public void fightAction() {
		vsLabel1.setText("<LV.1 START!>");
		vsLabel2.setText("워터슬라임 두둥등장!");
		
		vsLabel1.setVisible(true);
		vsLabel2.setVisible(true);
		selectLabel.setVisible(false);
		fightButton.setVisible(false);
		knifeButton.setVisible(false);
		axeButton.setVisible(false);
		attackButton.setVisible(true);
		defenseButton.setVisible(true);
		
		startVs.play();
		fightButton.setDisable(true);
		animationImage.setImage(vsFight);
		slimeLevel1.setImage(slime1);
		player.setText("플레이어");
		slime1Name.setText("LV.1 워터슬라임");
		slimeHp.setText(slimeTotHp + "HP");
		playerHp.setText(slimeTotHp + "HP");
		attackButton.setDisable(false);

		transition = new TranslateTransition();
		transition.setDuration(Duration.millis(500));
		transition.setToX(30);
		transition.setToY(-50);
		transition.setAutoReverse(true);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.setNode(slimeLevel1);
		transition.play();

		transition2 = new TranslateTransition();
		transition2.setDuration(Duration.millis(500));
		transition2.setToX(30);
		transition2.setToY(-50);
		transition2.setAutoReverse(true);
		transition2.setCycleCount(Animation.INDEFINITE);
		transition2.setNode(selectWappon);
		transition2.play();
	}

	@FXML
	public void attackAction() {
		vsLabel1.setText("<공격을 준비합니다>");
		vsLabel2.setText("무엇을 선택 하시겠습니까?");
		if (playerTotHp <= 10) {
			if (cnt == 0) {
				ultimateButton.setDisable(false);
			} else {
				ultimateButton.setDisable(true);
			}
		}
		attackButton.setDisable(true);
		defaultAttakBt.setDisable(false);
		healPButton.setDisable(false);
		specialButton.setDisable(false);
		
		defaultAttakBt.setVisible(true);
		healPButton.setVisible(true);
		specialButton.setVisible(true);
		ultimateButton.setVisible(true);

		String path = "/home/pc16/Desktop/프로젝트mp3/attack.mp3";
		String path2 = "/home/pc16/Desktop/프로젝트mp3/fire.mp3";
		String path3 = "/home/pc16/Desktop/프로젝트mp3/heal.mp3";
		String path4 = "/home/pc16/Desktop/프로젝트mp3/miss.mp3";
		String path5 = "/home/pc16/Desktop/프로젝트mp3/ultimate.mp3";

		media = new Media(new File(path).toURI().toString());
		media2 = new Media(new File(path2).toURI().toString());
		media3 = new Media(new File(path3).toURI().toString());
		media4 = new Media(new File(path4).toURI().toString());
		media5 = new Media(new File(path5).toURI().toString());

		attackDefalut = new MediaPlayer(media);
		fireAttack = new MediaPlayer(media2);
		healing = new MediaPlayer(media3);
		miss = new MediaPlayer(media4);
		ultimateAttack = new MediaPlayer(media5);

		animationImage.setImage(null);
	}

	@FXML
	public void defaultAttackAction() {
		animationImage.setImage(null);
		healPButton.setDisable(true);
		defaultAttakBt.setDisable(true);
		specialButton.setDisable(true);
		ultimateButton.setDisable(true);
		
		defaultAttakBt.setVisible(false);
		healPButton.setVisible(false);
		specialButton.setVisible(false);
		ultimateButton.setVisible(false);


		int playerAttack = (int) (Math.random() * 4);
		if (slimeTotHp > 0) {
			if (playerAttack <= 2) {
				attackDefalut.play();
				animationImage.setImage(attack);
				playerDamaged.setText("");
				defenseButton.setDisable(false);
				attackButton.setDisable(true);
				vsLabel1.setText("<일반공격!>");
				vsLabel2.setText("플레이어가 워터슬라임에게 20의 데미지를 주었습니다.");
				slimeDamaged.setText("-20HP");
				slimeHp.setText(slimeTotHp - 20 + "HP");
				temp = slimeTotHp - 20;
				slimeTotHp = temp;
				if (slimeTotHp <= 0) {
					defenseButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			} else if (playerAttack == 3) {
				miss.play();
				animationImage.setImage(shield);
				playerDamaged.setText("");
				defenseButton.setDisable(false);
				attackButton.setDisable(true);
				vsLabel1.setText("<빗나감!>");
				vsLabel2.setText("플레이어가 워터슬라임에게 아무데미지도 주지 못했습니다.");
				slimeDamaged.setText("MISS");
				slimeHp.setText(slimeTotHp + "HP");
				temp = slimeTotHp;
				slimeTotHp = temp;
				if (slimeTotHp <= 0) {
					defenseButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			}
		}
	}

	@FXML
	public void specialAction() {
		animationImage.setImage(null);
		healPButton.setDisable(true);
		defaultAttakBt.setDisable(true);
		specialButton.setDisable(true);
		ultimateButton.setDisable(true);
		
		defaultAttakBt.setVisible(false);
		healPButton.setVisible(false);
		specialButton.setVisible(false);
		ultimateButton.setVisible(false);

		int playerAttack = (int) (Math.random() * 2);
		if (slimeTotHp > 0) {
			if (playerAttack == 0) {
				fireAttack.play();
				animationImage.setImage(fire);
				playerDamaged.setText("");
				defenseButton.setDisable(false);
				attackButton.setDisable(true);
				vsLabel1.setText("<화염공격!>");
				vsLabel2.setText("플레이어가 워터슬라임에게 30의 데미지를 주었습니다.");
				slimeDamaged.setText("-30HP");
				slimeHp.setText(slimeTotHp - 30 + "HP");
				temp = slimeTotHp - 30;
				slimeTotHp = temp;
				if (slimeTotHp <= 0) {
					defenseButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			} else if (playerAttack == 1) {
				healing.play();
				animationImage.setImage(potion);
				playerDamaged.setText("");
				defenseButton.setDisable(false);
				attackButton.setDisable(true);
				vsLabel1.setText("<물공격!>");
				vsLabel2.setText("워터슬라임이 10HP를 회복합니다.");
				slimeDamaged.setText("+10HP");
				slimeHp.setText(slimeTotHp + 10 + "HP");
				temp = slimeTotHp + 10;
				slimeTotHp = temp;
				if (slimeTotHp <= 0) {
					defenseButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			}
		}
	}

	@FXML
	public void healPAction() {
		animationImage.setImage(null);
		healPButton.setDisable(true);
		defaultAttakBt.setDisable(true);
		specialButton.setDisable(true);
		ultimateButton.setDisable(true);
		
		defaultAttakBt.setVisible(false);
		healPButton.setVisible(false);
		specialButton.setVisible(false);
		ultimateButton.setVisible(false);
		
		if (slimeTotHp > 0) {
			healing.play();
			animationImage.setImage(potion);
			playerDamaged.setText("");
			defenseButton.setDisable(false);
			attackButton.setDisable(true);
			vsLabel1.setText("<회복포션!>");
			vsLabel2.setText("플레이어가 체력 10을 회복합니다!");
			playerDamaged.setText("+10HP");
			playerHp.setText(playerTotHp + 10 + "HP");
			temp = playerTotHp + 10;
			playerTotHp = temp;
			if (slimeTotHp <= 0) {
				defenseButton.setDisable(true);
				resultButton.setDisable(false);
				resultButton.setVisible(true);
				attackButton.setVisible(false);
				defenseButton.setVisible(false);
			}
		}
	}

	@FXML
	public void ultimateAction() {
		cnt = 1;
		animationImage.setImage(null);
		healPButton.setDisable(true);
		defaultAttakBt.setDisable(true);
		specialButton.setDisable(true);
		ultimateButton.setDisable(true);
		
		defaultAttakBt.setVisible(false);
		healPButton.setVisible(false);
		specialButton.setVisible(false);
		ultimateButton.setVisible(false);
		
		if (slimeTotHp > 0) {
			ultimateAttack.play();
			animationImage.setImage(ultimate);
			playerDamaged.setText("");
			defenseButton.setDisable(false);
			attackButton.setDisable(true);
			vsLabel1.setText("<최후의 저항!>");
			vsLabel2.setText("플레이어가 워터슬라임에게 40의 데미지를 주었습니다.");
			slimeDamaged.setText("-40HP");
			slimeHp.setText(slimeTotHp - 40 + "HP");
			temp = slimeTotHp - 40;
			slimeTotHp = temp;
			if (slimeTotHp <= 0) {
				defenseButton.setDisable(true);
				resultButton.setDisable(false);
				resultButton.setVisible(true);
				attackButton.setVisible(false);
				defenseButton.setVisible(false);
			}
		}
	}

	@FXML
	public void defenseAction() {

		String path = "/home/pc16/Desktop/프로젝트mp3/water.mp3";
		String path2 = "/home/pc16/Desktop/프로젝트mp3/critical.mp3";
		String path3 = "/home/pc16/Desktop/프로젝트mp3/miss.mp3";

		media = new Media(new File(path).toURI().toString());
		media2 = new Media(new File(path2).toURI().toString());
		media3 = new Media(new File(path3).toURI().toString());

		waterAttack = new MediaPlayer(media);
		criticalAttack = new MediaPlayer(media2);
		miss = new MediaPlayer(media3);

		animationImage.setImage(null);
		int slimeAttack = (int) (Math.random() * 5);
		if (playerTotHp > 0) {
			if (slimeAttack <= 2) {
				waterAttack.play();
				animationImage.setImage(spitting);
				slimeDamaged.setText("");
				attackButton.setDisable(false);
				defenseButton.setDisable(true);
				vsLabel1.setText("<거품광선!>");
				vsLabel2.setText("워터슬라임이 20의 데미지를 주었습니다.");
				playerDamaged.setText("-20HP");
				playerHp.setText(playerTotHp - 20 + "HP");
				temp = playerTotHp - 20;
				playerTotHp = temp;
				if (playerTotHp <= 0) {
					attackButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			} else if (slimeAttack == 3) {
				criticalAttack.play();
				animationImage.setImage(critical);
				slimeDamaged.setText("");
				attackButton.setDisable(false);
				defenseButton.setDisable(true);
				vsLabel1.setText("<크리티컬!>");
				vsLabel2.setText("워터슬라임이 30의 데미지를 주었습니다.");
				playerDamaged.setText("-30HP");
				playerHp.setText(playerTotHp - 30 + "HP");
				temp = playerTotHp - 30;
				playerTotHp = temp;
				if (playerTotHp <= 0) {
					attackButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			} else if (slimeAttack == 4) {
				miss.play();
				animationImage.setImage(shield);
				slimeDamaged.setText("");
				attackButton.setDisable(false);
				defenseButton.setDisable(true);
				vsLabel1.setText("<빗나감!>");
				vsLabel2.setText("워터슬라임이 플레이어에게 아무데미지도 주지 못했습니다.");
				playerDamaged.setText("Miss");
				playerHp.setText(playerTotHp + "HP");
				temp = playerTotHp;
				playerTotHp = temp;
				if (playerTotHp <= 0) {
					attackButton.setDisable(true);
					resultButton.setDisable(false);
					resultButton.setVisible(true);
					attackButton.setVisible(false);
					defenseButton.setVisible(false);
				}
			}
		}
	}
	@FXML
	public void resultAction() {
		vsLabel1.setVisible(false);
		vsLabel2.setVisible(false);
		animationImage.setImage(null);
		if (playerTotHp <= 0) {
			transition2.stop();
			fail.play();
			resultButton.setDisable(true);
			vsLabel1.setText("");
			vsLabel2.setText("");
			playerDamaged.setText("");
			slimeDamaged.setText("");
			playerHp.setText("플레이어 사망");
			slimeHp.setText("슬라임 승!");
			restartButton.setDisable(false);
			resultButton.setVisible(false);
			restartButton.setVisible(true);
		}
		if (slimeTotHp <= 0) {
			transition.stop();
			success.play();
			resultButton.setDisable(true);
			playerDamaged.setText("");
			slimeDamaged.setText("");
			vsLabel1.setText("");
			vsLabel2.setText("");
			playerHp.setText("플레이어 승!");
			slimeHp.setText("슬라임 사망!");
			nextStageButton.setDisable(false);
			resultButton.setVisible(false);
			nextStageButton.setVisible(true);
		}
	}

	@FXML
	public void nextStageAction() {
		transition.stop();
		transition2.stop();
		nextPage.play();
		Stage stage = (Stage) nextStageButton.getScene().getWindow();
		Parent second;
		try {
			second = FXMLLoader.load(getClass().getResource("SlimeGameNextStage.fxml"));
			stage.close();
			Scene sc = new Scene(second);
			sc.getStylesheets().add(getClass().getResource("application3.css").toExternalForm());
			stage.setScene(sc);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void restartAction() {
		transition.stop();
		transition2.stop();
		Stage stage = (Stage) restartButton.getScene().getWindow();
		Parent second;
		try {
			second = FXMLLoader.load(getClass().getResource("SlimeGameStart.fxml"));
			stage.close();
			Scene sc = new Scene(second);
			sc.getStylesheets().add(getClass().getResource("application2.css").toExternalForm());
			stage.setScene(sc);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
