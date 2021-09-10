module.exports = {
  root: true,
  extends: ['@dooboo/eslint-config', 'plugin:prettier/recommended'],
  rules: {
    'eslint-comments/no-unlimited-disable': 0,
    'eslint-comments/no-unused-disable': 0,
  },
  env: {
    'jest/globals': true,
  },
};
