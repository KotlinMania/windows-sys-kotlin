#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(void* hswdevice);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(void* pszenumeratorname, void* pszparentdeviceinstance, void* pcreateinfo, uint32_t cpropertycount, void* pproperties, void* pcallback, void* pcontext, void* phswdevice);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(void* hswdevice, void* plifetime);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(void* hswdevice, void* pszdeviceinterfaceid, uint32_t cpropertycount, void* pproperties);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(void* hswdevice, void* pinterfaceclassguid, void* pszreferencestring, uint32_t cpropertycount, void* pproperties, int32_t fenabled, void* ppszdeviceinterfaceid);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(void* hswdevice, void* pszdeviceinterfaceid, int32_t fenabled);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(void* hswdevice, uint32_t cpropertycount, void* pproperties);
int32_t windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(void* hswdevice, int32_t lifetime);
void windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(void* pmem);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WINDOWS_WIN32_DEVICES_ENUMERATION_PNP_WRAPPER_H */
