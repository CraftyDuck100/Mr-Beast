# Team 2531 RoboHawks 2023 Robot - code contribution standards & procedures.

## overview:
Developers are welcome to add to the team 2531 robotics code whether they are part of the programming team or not. The process for doing this applies equally to the programming team as well as non-members as follows:

## Requirements:
- Before beginning development, the contributor MUST discuss their plans with the programming team (NOT just the programming leads). The point of this discussion is to coordinate with the team and avoid any duplication of effort as well as to deterimne the need for the proposed changes.
- Changes must be based upon our current GitHub repo located at https://github.com/2531RoboHawks/SwerveDrive.
- Proposed changes must be made on a BRANCH other than main.
- Proposed changes must follow the team's contribution procedures and meet the team's programming standards.  (Both outlined below.)

## Standards:
- Code must be clearly commented.
  - Contributed code must have a header block including:
      - date written
      - author
      - general overview
      - Change history as appropriate.
  - Previously existing code is NOT excused from the above requirement.  If you change a module, COMMENT IT!
  - Further, comments for each logical block of code are required.  These comments should explain what that logical block does. 
  - Any code that uses unusual structures or approaches must clearly explain those structures and approaches.
  - It is recommended that developers follow The literate programming approach: https://csli.sites.stanford.edu/publications/coding-languages/literate-programming.
- Comments should adhere to the 9 principles outlined in this article:
https://stackoverflow.blog/2021/12/23/best-practices-for-writing-code-comments/
  1. Comments should not duplicate the code.
  2. Good comments do not excuse unclear code.
  3. If you can’t write a clear comment, there may be a problem with the code.
  4. Comments should dispel confusion, not cause it.
  5. Explain unidiomatic code in comments.
  6. Provide links to the original source of copied code.
  7. Include links to external references where they will be most helpful.
  8. Add comments when fixing bugs.
  9. Use comments to mark incomplete implementations.

## Process:
- Proposed changes must be reviewed with the programming team to the point that the entire team understands everything being proposed.
- The programming team may offer suggestions to be implemented (This would neccessitate another subsequent code review).
- Proposed changes must be tested on one of the physical robots by loading that branch up to the robot.
    - Changes must work as advertised.
    - Changes must not interfere with any other functionality of the code.
- After the changes have been:
  - reviewed by the team
  - confirmed to be working as advertised
  - understood by the team
  - confirmed that they don't introduce other problems.
- The team may include the changes and merge to the main branch.
