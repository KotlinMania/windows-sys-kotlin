#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_componentservices_CoCreateActivity(void* piunknown, void* riid, void* ppobj);
int32_t windowssys_windows_win32_system_componentservices_CoEnterServiceDomain(void* pconfigobject);
int32_t windowssys_windows_win32_system_componentservices_CoGetDefaultContext(int32_t apttype, void* riid, void* ppv);
void windowssys_windows_win32_system_componentservices_CoLeaveServiceDomain(void* punkstatus);
int32_t windowssys_windows_win32_system_componentservices_GetDispenserManager(void* param0);
int32_t windowssys_windows_win32_system_componentservices_GetManagedExtensions(void* dwexts);
int32_t windowssys_windows_win32_system_componentservices_MTSCreateActivity(void* riid, void* ppobj);
int32_t windowssys_windows_win32_system_componentservices_RecycleSurrogate(int32_t lreasoncode);
void* windowssys_windows_win32_system_componentservices_SafeRef(void* rid, void* punk);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H */
