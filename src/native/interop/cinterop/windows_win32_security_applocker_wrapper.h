#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_APPLOCKER_WINDOWS_WIN32_SECURITY_APPLOCKER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_APPLOCKER_WINDOWS_WIN32_SECURITY_APPLOCKER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_applocker_saferCloseLevel(void* hlevelhandle);
int32_t windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel(void* levelhandle, void* inaccesstoken, void* outaccesstoken, uint32_t dwflags, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferCreateLevel(uint32_t dwscopeid, uint32_t dwlevelid, uint32_t openflags, void* plevelhandle, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferGetLevelInformation(void* levelhandle, int32_t dwinfotype, void* lpquerybuffer, uint32_t dwinbuffersize, void* lpdwoutbuffersize);
int32_t windowssys_windows_win32_security_applocker_saferGetPolicyInformation(uint32_t dwscopeid, int32_t saferpolicyinfoclass, uint32_t infobuffersize, void* infobuffer, void* infobufferretsize, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferIdentifyLevel(uint32_t dwnumproperties, void* pcodeproperties, void* plevelhandle, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferRecordEventLogEntry(void* hlevel, void* sztargetpath, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferSetLevelInformation(void* levelhandle, int32_t dwinfotype, void* lpquerybuffer, uint32_t dwinbuffersize);
int32_t windowssys_windows_win32_security_applocker_saferSetPolicyInformation(uint32_t dwscopeid, int32_t saferpolicyinfoclass, uint32_t infobuffersize, void* infobuffer, void* lpreserved);
int32_t windowssys_windows_win32_security_applocker_saferiIsExecutableFileType(void* szfullpathname, bool bfromshellexecute);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_APPLOCKER_WINDOWS_WIN32_SECURITY_APPLOCKER_WRAPPER_H */
