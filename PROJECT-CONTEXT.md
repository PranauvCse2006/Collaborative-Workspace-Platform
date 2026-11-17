# Collaborative Workspace & Workflow Management Platform

## 1. Project Information

- **Project name:** Collaborative Workspace & Workflow Management Platform
- **Project type:** Full-stack web application
- **GitHub repository:** https://github.com/PranauvCse2006/Collaborative-Workspace-Platform
- **Purpose:** Practical full-stack development and portfolio project
- **Target users:** College project groups, small businesses, startup teams, and individuals managing collaborative projects

## 2. Project Vision

Build a centralized platform where people can create workspaces, collaborate on projects, assign tasks, track progress, and manage work through structured approval workflows.

The intended experience is a practical collaboration and project-management product, not merely a basic CRUD or student-management application.

## 3. Planned Features

### User management
- User registration and login
- User profile management
- Secure authentication

### Workspace management
- Users can create multiple workspaces
- Workspaces can be public or private
- Users can browse public workspaces
- Workspace owners manage their workspaces

### Membership management
- Users can request to join workspaces
- Owners can approve or reject membership requests
- Owners can manage workspace members

### Roles and permissions
Planned roles include Owner, Admin, Project Manager, and Member. The owner should have the highest level of control over workspace permissions.

### Project and task management
- Create projects within workspaces
- Create and assign tasks
- Set task deadlines
- Update task status
- Track project and task progress

### Approval workflows
- Users can submit requests for approval
- Workspace owners can configure approval stages
- Important tasks may use multiple approval stages
- Editing an approved request should return it to a pending state

### Possible future enhancements
- Comments and discussions
- Notifications
- Activity history
- Advanced project analytics

These are planned features, not claims that they have already been implemented.

## 4. Proposed Technology Stack

| Component | Technology |
|---|---|
| Frontend | React |
| Styling | Tailwind CSS |
| Backend | Java and Spring Boot |
| Database | MySQL |
| ORM | Spring Data JPA / Hibernate |
| Authentication | Spring Security and JWT |
| API documentation | Swagger / OpenAPI |
| API testing | Postman |
| Version control | Git and GitHub |

Docker, GitHub Actions, and deployment services may be considered later. Deployment choices must be checked against current free-tier limits before use.

## 5. Development Approach

Use a hybrid learning-and-building approach:

1. Explain unfamiliar concepts before implementation.
2. Let the developer attempt concepts they already know.
3. Give hints before providing a complete solution.
4. Review the developer's code and prefer minimal, understandable corrections.
5. Explain why changes are needed.
6. Test each feature before moving on.
7. Avoid blindly copying large blocks of generated code.
8. Ensure the developer can explain the implementation in an interview.

## 6. Local Repository Setup

The repository was cloned into this local folder:

`Documents/Projects in GitHub/Collaborative Workspace Platform`

The clone command used was:

```bash
git clone https://github.com/PranauvCse2006/Collaborative-Workspace-Platform.git .
```

The final dot cloned the repository contents into the currently opened, empty folder.

## 7. Current Folder Structure

The structure shown in VS Code is:

```text
Collaborative Workspace Platform/
├── Backend/
├── Frontend/
├── Docs/
│   ├── diagrams/
│   ├── reports/
│   └── requirements/
│       └── Project-Overview.md
└── README.md
```

Keep the existing folder names and capitalization. Do not rename them without discussing it first.

## 8. Existing Documentation

`Docs/requirements/Project-Overview.md` has been created. It covers:
- Project overview
- Problem statement
- Objectives
- Target users
- Core features
- Future enhancements
- Proposed technology stack
- Project scope
- Expected outcome

## 9. Git Workflow

Check the working tree:

```bash
git status
```

Stage changes:

```bash
git add .
```

Commit changes:

```bash
git commit -m "Describe the change"
```

Push to GitHub:

```bash
git push origin main
```

Before committing, inspect `git status` so only intended files are included. Use meaningful commit messages and genuine development dates. Never fabricate or backdate commits, screenshots, progress, or work history.

The initial commit and push of `Project-Overview.md` were suggested, but their successful completion was not confirmed in the conversation. Verify the repository before assuming the file is online.



## 10. Immediate Delivery Priority

Suggested order:

1. Verify the repository and documentation commits.
2. Finalize functional requirements and MVP scope.
3. Write the Software Requirements Specification (SRS).
4. Design the database and create an ER diagram.
5. Initialize the Spring Boot backend.
6. Implement and test user authentication.
7. Implement workspace and membership functionality.
8. Implement projects and tasks.
9. Build the React frontend and integrate the APIs.
10. Test, capture genuine screenshots, document actual progress, and attempt deployment.

Advanced workflows, notifications, analytics, and other enhancements can follow after the core MVP.

## 11. Free Deployment Requirement

The goal is to deploy publicly without paid subscriptions or a paid domain. Free hosting options previously considered include Cloudflare Pages, Render, and Supabase, but the database choice currently recorded is MySQL. Check compatibility, current pricing, sleep/pause behavior, and any payment-card requirements before selecting providers. Do not assume a free tier is permanent.

## 12. Instructions for Future Development Sessions

- Continue from the existing repository; do not create a duplicate project.
- Inspect the current code and files before proposing changes.
- Distinguish planned features from implemented features.
- Preserve the existing folder structure.
- Keep the selected technology stack unless a change is discussed first.
- Explain concepts at a beginner-friendly level.
- Prefer incremental implementation and hints over immediately supplying complete code.
- Test features before moving forward.
- Keep documentation aligned with the actual implementation.
- Prioritize a working, understandable application over a large set of unfinished features.

**Primary goal:** Build a genuine, understandable, and deployable collaborative platform that demonstrates practical software-engineering skills and can be confidently explained in placement interviews.
