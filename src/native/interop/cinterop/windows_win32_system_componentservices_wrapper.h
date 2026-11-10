#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_componentservices_coCreateActivity(void* piunknown, void* riid, void* ppobj);
int32_t windowssys_windows_win32_system_componentservices_coEnterServiceDomain(void* pconfigobject);
int32_t windowssys_windows_win32_system_componentservices_coGetDefaultContext(int32_t apttype, void* riid, void* ppv);
void windowssys_windows_win32_system_componentservices_coLeaveServiceDomain(void* punkstatus);
int32_t windowssys_windows_win32_system_componentservices_getDispenserManager(void* param0);
int32_t windowssys_windows_win32_system_componentservices_getManagedExtensions(void* dwexts);
int32_t windowssys_windows_win32_system_componentservices_mTSCreateActivity(void* riid, void* ppobj);
int32_t windowssys_windows_win32_system_componentservices_recycleSurrogate(int32_t lreasoncode);
void* windowssys_windows_win32_system_componentservices_safeRef(void* rid, void* punk);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H */
