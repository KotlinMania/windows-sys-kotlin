package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun HcnCloseEndpoint(endpoint: Long): HRESULT

public expect fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT

public expect fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT

public expect fun HcnCloseNamespace(namespace: Long): HRESULT

public expect fun HcnCloseNetwork(network: Long): HRESULT

public expect fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT

public expect fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT

public expect fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT

public expect fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT

public expect fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT

public expect fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT

public expect fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT

public expect fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT

public expect fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT

public expect fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT

public expect fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT

public expect fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT

public expect fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT

public expect fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT

public expect fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT

public expect fun HcnFreeGuestNetworkPortReservations(portentries: Long)

public expect fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT

public expect fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT

public expect fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT

public expect fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT

public expect fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT

public expect fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT

public expect fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT

public expect fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT

public expect fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT

public expect fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT

public expect fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT

public expect fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT

public expect fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT

public expect fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT

public expect fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT

public expect fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT

public expect fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT
