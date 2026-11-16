#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(void* qoshandle, uint64_t arg1Socket, void* destaddr, int32_t traffictype, uint32_t flags, void* flowid);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSCancel(void* qoshandle, void* overlapped);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(void* qoshandle);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(void* version, void* qoshandle);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(void* qoshandle, void* size, void* buffer);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(void* qoshandle, uint64_t arg1Socket, uint32_t flowid, uint32_t flags);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(void* qoshandle, uint32_t flowid, int32_t operation, uint32_t size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
int32_t windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcAddFilter(void* flowhandle, void* pgenericfilter, void* pfilterhandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcAddFlow(void* ifchandle, void* clflowctx, uint32_t flags, void* pgenericflow, void* pflowhandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(void* ifchandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(void* filterhandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(void* flowhandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(void* clienthandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(void* ifchandle, void* penumhandle, void* pflowcount, void* pbufsize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(void* clienthandle, void* pbuffersize, void* interfacebuffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(void* flowhandle, void* pgenericflow);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(void* ifchandle, void* pguidparam, bool notifychange, void* pbuffersize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(uint32_t tciversion, void* clregctx, void* clienthandlerlist, void* pclienthandle);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssysWindowsWin32NetworkmanagementQosTcSetInterface(void* ifchandle, void* pguidparam, uint32_t buffersize, void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H */
