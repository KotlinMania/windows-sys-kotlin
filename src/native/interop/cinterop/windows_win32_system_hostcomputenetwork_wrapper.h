#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCloseEndpoint(void* endpoint);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCloseGuestNetworkService(void* guestnetworkservice);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCloseLoadBalancer(void* loadbalancer);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNamespace(void* arg_0_namespace);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNetwork(void* network);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCreateEndpoint(void* network, void* id, void* settings, void* endpoint, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCreateGuestNetworkService(void* id, void* settings, void* guestnetworkservice, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCreateLoadBalancer(void* id, void* settings, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNamespace(void* id, void* settings, void* arg_2_namespace, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNetwork(void* id, void* settings, void* network, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteEndpoint(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteGuestNetworkService(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteLoadBalancer(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNamespace(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNetwork(void* id, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateEndpoints(void* query, void* endpoints, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateGuestNetworkPortReservations(void* returncount, void* portentries);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateLoadBalancers(void* query, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNamespaces(void* query, void* namespaces, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNetworks(void* query, void* networks, void* errorrecord);
void windowssys_windows_win32_system_hostcomputenetwork_hcnFreeGuestNetworkPortReservations(void* portentries);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnModifyEndpoint(void* endpoint, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnModifyGuestNetworkService(void* guestnetworkservice, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnModifyLoadBalancer(void* loadbalancer, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNamespace(void* arg_0_namespace, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNetwork(void* network, void* settings, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnOpenEndpoint(void* id, void* endpoint, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnOpenLoadBalancer(void* id, void* loadbalancer, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNamespace(void* id, void* arg_1_namespace, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNetwork(void* id, void* network, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointAddresses(void* endpoint, void* query, void* addresses, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointProperties(void* endpoint, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointStats(void* endpoint, void* query, void* stats, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryLoadBalancerProperties(void* loadbalancer, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNamespaceProperties(void* arg_0_namespace, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNetworkProperties(void* network, void* query, void* properties, void* errorrecord);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterGuestNetworkServiceCallback(void* guestnetworkservice, void* callback, void* context, void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterServiceCallback(void* callback, void* context, void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnReleaseGuestNetworkServicePortReservationHandle(void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePort(void* guestnetworkservice, int32_t protocol, int32_t access, uint16_t port, void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePortRange(void* guestnetworkservice, uint16_t portcount, void* portrangereservation, void* portreservationhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterGuestNetworkServiceCallback(void* callbackhandle);
int32_t windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterServiceCallback(void* callbackhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H */
