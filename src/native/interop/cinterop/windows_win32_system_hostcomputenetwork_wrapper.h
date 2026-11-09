#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(void* endpoint);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(void* guestnetworkservice);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(void* loadbalancer);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(void* arg_0_namespace);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(void* network);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(void* network, void* id, void* settings, void* endpoint, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(void* id, void* settings, void* guestnetworkservice, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(void* id, void* settings, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(void* id, void* settings, void* arg_2_namespace, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(void* id, void* settings, void* network, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(void* query, void* endpoints, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(void* returncount, void* portentries);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(void* query, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(void* query, void* namespaces, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(void* query, void* networks, void* errorrecord);
void windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(void* portentries);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(void* endpoint, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(void* guestnetworkservice, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(void* loadbalancer, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(void* arg_0_namespace, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(void* network, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(void* id, void* endpoint, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(void* id, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(void* id, void* arg_1_namespace, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(void* id, void* network, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(void* endpoint, void* query, void* addresses, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(void* endpoint, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(void* endpoint, void* query, void* stats, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(void* loadbalancer, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(void* arg_0_namespace, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(void* network, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(void* guestnetworkservice, void* callback, void* context, void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(void* callback, void* context, void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(void* guestnetworkservice, int32_t protocol, int32_t access, uint16_t port, void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(void* guestnetworkservice, uint16_t portcount, void* portrangereservation, void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(void* callbackhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H */
