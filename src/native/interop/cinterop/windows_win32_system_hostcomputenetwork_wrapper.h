#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(void* endpoint);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(void* guestnetworkservice);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(void* loadbalancer);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(void* arg0Namespace);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(void* network);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(void* network, void* id, void* settings, void* endpoint, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(void* id, void* settings, void* guestnetworkservice, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(void* id, void* settings, void* loadbalancer, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(void* id, void* settings, void* arg2Namespace, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(void* id, void* settings, void* network, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(void* id, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(void* id, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(void* id, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(void* id, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(void* id, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(void* query, void* endpoints, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(void* returncount, void* portentries);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(void* query, void* loadbalancer, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(void* query, void* namespaces, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(void* query, void* networks, void* errorrecord);
void windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(void* portentries);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(void* endpoint, void* settings, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(void* guestnetworkservice, void* settings, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(void* loadbalancer, void* settings, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(void* arg0Namespace, void* settings, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(void* network, void* settings, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(void* id, void* endpoint, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(void* id, void* loadbalancer, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(void* id, void* arg1Namespace, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(void* id, void* network, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(void* endpoint, void* query, void* addresses, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(void* endpoint, void* query, void* properties, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(void* endpoint, void* query, void* stats, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(void* loadbalancer, void* query, void* properties, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(void* arg0Namespace, void* query, void* properties, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(void* network, void* query, void* properties, void* errorrecord);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(void* guestnetworkservice, void* callback, void* context, void* callbackhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(void* callback, void* context, void* callbackhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(void* portreservationhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(void* guestnetworkservice, int32_t protocol, int32_t access, uint16_t port, void* portreservationhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(void* guestnetworkservice, uint16_t portcount, void* portrangereservation, void* portreservationhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(void* callbackhandle);
int32_t windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(void* callbackhandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WINDOWS_WIN32_SYSTEM_HOSTCOMPUTENETWORK_WRAPPER_H */
