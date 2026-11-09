#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_netshell_MatchEnumTag(void* hmodule, void* pwcarg, uint32_t dwnumarg, void* penumtable, void* pdwvalue);
int32_t windowssys_windows_win32_networkmanagement_netshell_MatchToken(void* pwszusertoken, void* pwszcmdtoken);
uint32_t windowssys_windows_win32_networkmanagement_netshell_PreprocessCommand(void* hmodule, void* ppwcarguments, uint32_t dwcurrentindex, uint32_t dwargcount, void* ptttags, uint32_t dwtagcount, uint32_t dwminargs, uint32_t dwmaxargs, void* pdwtagtype);
uint32_t windowssys_windows_win32_networkmanagement_netshell_RegisterContext(void* pchildcontext);
uint32_t windowssys_windows_win32_networkmanagement_netshell_RegisterHelper(void* pguidparentcontext, void* pfnregistersubcontext);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H */
