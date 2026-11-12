#ifndef WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(void* vhfoperationhandle, int32_t completionstatus);
int32_t windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(void* vhfconfig, void* vhfhandle);
void windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(void* vhfhandle, bool wait);
int32_t windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(void* vhfhandle, void* hidtransferpacket);
int32_t windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(void* vhfhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WINDOWS_WDK_DEVICES_HUMANINTERFACEDEVICE_WRAPPER_H */
