@echo off
git config user.name "%1"
git config user.email "%2"

:end
    echo Signed in as:
    git config user.name
    git config user.email