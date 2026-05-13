

public boolean moveCandyToFirstRow(int col){
	if(box[0][col] != null){
		return true; 
	}else{
		for(int row = 1; row < box.length; row++){
			if(box[row][col] != null){
				box[0][col] = box[row][col]; 
				box[row][col] = null; 
				return true; 
			}
		}
		return false;
	} 
}

public Candy removeNextByFlavor(String flavor){
	Candy remove; 
	for(int row = box.length -1; row >= 0; row--){
		for(int col = 0; col < box[0].length; col++){
			if(box[row][col].getFlavor().equals(flavor)){
				remove = box[row][col];
				box[row][col] = null;
				return remove; 
			
			}
		}
	}
	return null; 
}
