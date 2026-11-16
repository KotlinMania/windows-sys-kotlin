#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkmanagementNetshellMatchEnumTag(void* hmodule, void* pwcarg, uint32_t dwnumarg, void* penumtable, void* pdwvalue);
int32_t windowssysWindowsWin32NetworkmanagementNetshellMatchToken(void* pwszusertoken, void* pwszcmdtoken);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellPreprocessCommand(void* hmodule, void* ppwcarguments, uint32_t dwcurrentindex, uint32_t dwargcount, void* ptttags, uint32_t dwtagcount, uint32_t dwminargs, uint32_t dwmaxargs, void* pdwtagtype);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintError(void* hmodule, uint32_t dwerrid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintMessage(void* pwszformat, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellPrintMessageFromModule(void* hmodule, uint32_t dwmsgid, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellRegisterContext(void* pchildcontext);
uint32_t windowssysWindowsWin32NetworkmanagementNetshellRegisterHelper(void* pguidparentcontext, void* pfnregistersubcontext);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WINDOWS_WIN32_NETWORKMANAGEMENT_NETSHELL_WRAPPER_H */
