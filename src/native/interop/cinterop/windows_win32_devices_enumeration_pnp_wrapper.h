#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_devices_enumeration_pnp_SwDeviceClose(void* hswdevice);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceCreate(void* pszenumeratorname, void* pszparentdeviceinstance, void* pcreateinfo, uint32_t cpropertycount, void* pproperties, void* pcallback, void* pcontext, void* phswdevice);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceGetLifetime(void* hswdevice, void* plifetime);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfacePropertySet(void* hswdevice, void* pszdeviceinterfaceid, uint32_t cpropertycount, void* pproperties);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceRegister(void* hswdevice, void* pinterfaceclassguid, void* pszreferencestring, uint32_t cpropertycount, void* pproperties, int32_t fenabled, void* ppszdeviceinterfaceid);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceInterfaceSetState(void* hswdevice, void* pszdeviceinterfaceid, int32_t fenabled);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDevicePropertySet(void* hswdevice, uint32_t cpropertycount, void* pproperties);
int32_t windowssys_windows_win32_devices_enumeration_pnp_SwDeviceSetLifetime(void* hswdevice, int32_t lifetime);
void windowssys_windows_win32_devices_enumeration_pnp_SwMemFree(void* pmem);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H */
