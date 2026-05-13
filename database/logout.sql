-- Session table (if not already created)
CREATE TABLE user_sessions (
    session_id VARCHAR(100) PRIMARY KEY,
    user_id INT,
    login_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Logout query: remove session
DELETE FROM user_sessions
WHERE user_id = 1;
