#ifndef WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfAsyncOperationComplete(void* vhfoperationhandle, int32_t completionstatus);
int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfCreate(void* vhfconfig, void* vhfhandle);
void windowssys_windows_wdk_devices_humaninterfacedevice_vhfDelete(void* vhfhandle, bool wait);
int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfReadReportSubmit(void* vhfhandle, void* hidtransferpacket);
int32_t windowssys_windows_wdk_devices_humaninterfacedevice_vhfStart(void* vhfhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H */
