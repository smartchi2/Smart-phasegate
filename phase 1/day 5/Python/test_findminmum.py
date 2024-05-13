from findminmum import find_minmum_number

def test_for_findlarge_return_pass():
	assert find_Largest_number(3,15,10) == 15
	assert find_Largest_number(40,5,2) == 40
	
def test_for_findlarge_return_fail():
	assert find_Largest_number(10,6,9) == 6
	assert find_Largest_number(12,11,7) == 7