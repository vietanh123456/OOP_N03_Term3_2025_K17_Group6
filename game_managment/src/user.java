class User:
    def __init__(self, user_id, username, email, avatar=None):
        self.user_id = user_id
        self.username = username
        self.email = email
        self.avatar = avatar
        self.library = []  

    def add_game(self, user_game):
        self.library.append(user_game)

    def __str__(self):
        return f"User: {self.username} ({self.email})"
