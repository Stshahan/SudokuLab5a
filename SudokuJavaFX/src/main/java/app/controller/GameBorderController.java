package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import pkgEnum.eGameDifficulty;

public class GameBorderController implements Initializable {

	private Game game;

	@FXML
	private ToggleGroup tglSudokuSize;

	@FXML
	private ToggleGroup tglDifficulty;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(Game game) {
		this.game = game;
	}
//changed implementations for GetGameDifficulty and GetGameSize
	public int GetGameSize() {
		RadioMenuItem rmi = (RadioMenuItem) tglSudokuSize.getSelectedToggle();
		int gameSize=4;
		if(rmi.getText().contentEquals("4"))
			gameSize=4;
		if(rmi.getText().contentEquals("9"))
			gameSize=9;
			return gameSize;
	}

	public eGameDifficulty GetGameDifficulty() {
		RadioMenuItem rmi = (RadioMenuItem) tglDifficulty.getSelectedToggle();
		eGameDifficulty eGD = eGameDifficulty.MEDIUM;
		if(rmi.getText().contentEquals("Easy"))
			eGD = eGameDifficulty.EASY;
		if(rmi.getText().contentEquals("Medium"))
			eGD = eGameDifficulty.MEDIUM;
		if(rmi.getText().contentEquals("Hard"))
			eGD = eGameDifficulty.HARD;
		
		return eGD;
	}

}
