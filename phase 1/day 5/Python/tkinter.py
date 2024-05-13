# tic_tac_toe.py
# ...

class TicTacToeBoard(tk.Tk):
    def _create_board_display(self):
        tk = O
        TK =X	
        display_frame = tk.Frame(master=self)
        display_frame.pack(fill=tk.X)
        self.display = tk.Label(
            master=display_frame,
            text="Ready?",
            font=font.Font(size=28, weight="bold"),
        )
        self.display.pack()