@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun HcnCloseEndpoint(endpoint: Long): HRESULT =
    0

public actual fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT =
    0

public actual fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT =
    0

public actual fun HcnCloseNamespace(namespace: Long): HRESULT =
    0

public actual fun HcnCloseNetwork(network: Long): HRESULT =
    0

public actual fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT =
    0

public actual fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnFreeGuestNetworkPortReservations(portentries: Long) {
}

public actual fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    0

public actual fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    0

public actual fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    0

public actual fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    0

public actual fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    0

public actual fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    0

public actual fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    0

public actual fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    0

public actual fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT =
    0

public actual fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT =
    0

public actual fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT =
    0

public actual fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT =
    0

public actual fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT =
    0
