#Git Workflow
Follow the steps below to initialize a repository, manage branches, and merge changes effectively.

🔧 1. Initialize a Git Repository
bash
Copy
Edit
git init
👤 2. Configure Git User
bash
Copy
Edit
git config user.name "Your Name"
git config user.email "you@example.com"
📦 3. Stage and Commit Initial Changes
bash
Copy
Edit
git add .
git commit -m "Initial commit"
🌿 4. Create and Switch to a New Branch
bash
Copy
Edit
git branch feature-branch-name
git checkout feature-branch-name
✍️ 5. Make Changes, Then Stage and Commit
bash
Copy
Edit
git add .
git commit -m "Description of changes"
🔄 6. Push and Create a Pull Request
bash
Copy
Edit
git push origin feature-branch-name
🔗 Open GitHub and create a pull request from the feature-branch-name to the main branch.

🛠️ 7. Merge Changes into Main
bash
Copy
Edit
git checkout main
git pull origin main  # Optional: Update local main
git merge feature-branch-name
🚀 8. Push Merged Changes
bash
Copy
Edit
git push origin main
