#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemComponentservicesCoCreateActivity(void* piunknown, void* riid, void* ppobj);
int32_t windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(void* pconfigobject);
int32_t windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(int32_t apttype, void* riid, void* ppv);
void windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(void* punkstatus);
int32_t windowssysWindowsWin32SystemComponentservicesGetDispenserManager(void* param0);
int32_t windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(void* dwexts);
int32_t windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(void* riid, void* ppobj);
int32_t windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(int32_t lreasoncode);
void* windowssysWindowsWin32SystemComponentservicesSafeRef(void* rid, void* punk);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WINDOWS_WIN32_SYSTEM_COMPONENTSERVICES_WRAPPER_H */
