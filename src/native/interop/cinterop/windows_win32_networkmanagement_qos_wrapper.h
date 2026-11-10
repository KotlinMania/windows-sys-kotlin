#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networkmanagement_qos_qOSAddSocketToFlow(void* qoshandle, uint64_t arg_1_socket, void* destaddr, int32_t traffictype, uint32_t flags, void* flowid);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSCancel(void* qoshandle, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSCloseHandle(void* qoshandle);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSCreateHandle(void* version, void* qoshandle);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSEnumerateFlows(void* qoshandle, void* size, void* buffer);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSNotifyFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSQueryFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSRemoveSocketFromFlow(void* qoshandle, uint64_t arg_1_socket, uint32_t flowid, uint32_t flags);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSSetFlow(void* qoshandle, uint32_t flowid, int32_t operation, uint32_t size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSStartTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
int32_t windowssys_windows_win32_networkmanagement_qos_qOSStopTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcAddFilter(void* flowhandle, void* pgenericfilter, void* pfilterhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcAddFlow(void* ifchandle, void* clflowctx, uint32_t flags, void* pgenericflow, void* pflowhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcCloseInterface(void* ifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcDeleteFilter(void* filterhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcDeleteFlow(void* flowhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcDeregisterClient(void* clienthandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcEnumerateFlows(void* ifchandle, void* penumhandle, void* pflowcount, void* pbufsize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcEnumerateInterfaces(void* clienthandle, void* pbuffersize, void* interfacebuffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameA(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcGetFlowNameW(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcModifyFlow(void* flowhandle, void* pgenericflow);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceA(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcOpenInterfaceW(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcQueryFlowA(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcQueryFlowW(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcQueryInterface(void* ifchandle, void* pguidparam, bool notifychange, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcRegisterClient(uint32_t tciversion, void* clregctx, void* clienthandlerlist, void* pclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcSetFlowA(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcSetFlowW(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_tcSetInterface(void* ifchandle, void* pguidparam, uint32_t buffersize, void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H */
