#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networkmanagement_qos_QOSAddSocketToFlow(void* qoshandle, uint64_t arg_1_socket, void* destaddr, int32_t traffictype, uint32_t flags, void* flowid);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSCancel(void* qoshandle, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSCloseHandle(void* qoshandle);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSCreateHandle(void* version, void* qoshandle);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSEnumerateFlows(void* qoshandle, void* size, void* buffer);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSNotifyFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSQueryFlow(void* qoshandle, uint32_t flowid, int32_t operation, void* size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSRemoveSocketFromFlow(void* qoshandle, uint64_t arg_1_socket, uint32_t flowid, uint32_t flags);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSSetFlow(void* qoshandle, uint32_t flowid, int32_t operation, uint32_t size, void* buffer, uint32_t flags, void* overlapped);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSStartTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
int32_t windowssys_windows_win32_networkmanagement_qos_QOSStopTrackingClient(void* qoshandle, void* destaddr, uint32_t flags);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcAddFilter(void* flowhandle, void* pgenericfilter, void* pfilterhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcAddFlow(void* ifchandle, void* clflowctx, uint32_t flags, void* pgenericflow, void* pflowhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcCloseInterface(void* ifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeleteFilter(void* filterhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeleteFlow(void* flowhandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcDeregisterClient(void* clienthandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcEnumerateFlows(void* ifchandle, void* penumhandle, void* pflowcount, void* pbufsize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcEnumerateInterfaces(void* clienthandle, void* pbuffersize, void* interfacebuffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameA(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcGetFlowNameW(void* flowhandle, uint32_t strsize, void* pflowname);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcModifyFlow(void* flowhandle, void* pgenericflow);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceA(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcOpenInterfaceW(void* pinterfacename, void* clienthandle, void* clifcctx, void* pifchandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryFlowA(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryFlowW(void* pflowname, void* pguidparam, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcQueryInterface(void* ifchandle, void* pguidparam, bool notifychange, void* pbuffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcRegisterClient(uint32_t tciversion, void* clregctx, void* clienthandlerlist, void* pclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetFlowA(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetFlowW(void* pflowname, void* pguidparam, uint32_t buffersize, void* buffer);
uint32_t windowssys_windows_win32_networkmanagement_qos_TcSetInterface(void* ifchandle, void* pguidparam, uint32_t buffersize, void* buffer);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WINDOWS_WIN32_NETWORKMANAGEMENT_QOS_WRAPPER_H */
