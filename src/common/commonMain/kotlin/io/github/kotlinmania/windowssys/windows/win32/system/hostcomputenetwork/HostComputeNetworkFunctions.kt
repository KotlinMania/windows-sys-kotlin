package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun hcnCloseEndpoint(endpoint: COpaquePointer?): Hresult

public expect fun hcnCloseGuestNetworkService(guestnetworkservice: COpaquePointer?): Hresult

public expect fun hcnCloseLoadBalancer(loadbalancer: COpaquePointer?): Hresult

public expect fun hcnCloseNamespace(namespace: COpaquePointer?): Hresult

public expect fun hcnCloseNetwork(network: COpaquePointer?): Hresult

public expect fun hcnCreateEndpoint(network: COpaquePointer?, id: COpaquePointer?, settings: Pcwstr, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnCreateGuestNetworkService(id: COpaquePointer?, settings: Pcwstr, guestnetworkservice: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnCreateLoadBalancer(id: COpaquePointer?, settings: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnCreateNamespace(id: COpaquePointer?, settings: Pcwstr, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnCreateNetwork(id: COpaquePointer?, settings: Pcwstr, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnDeleteEndpoint(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnDeleteGuestNetworkService(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnDeleteLoadBalancer(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnDeleteNamespace(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnDeleteNetwork(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnEnumerateGuestNetworkPortReservations(returncount: COpaquePointer?, portentries: COpaquePointer?): Hresult

public expect fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnEnumerateNetworks(query: Pcwstr, networks: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnFreeGuestNetworkPortReservations(portentries: COpaquePointer?)

public expect fun hcnModifyEndpoint(endpoint: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult

public expect fun hcnModifyGuestNetworkService(guestnetworkservice: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult

public expect fun hcnModifyLoadBalancer(loadbalancer: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult

public expect fun hcnModifyNamespace(namespace: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult

public expect fun hcnModifyNetwork(network: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult

public expect fun hcnOpenEndpoint(id: COpaquePointer?, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnOpenLoadBalancer(id: COpaquePointer?, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnOpenNamespace(id: COpaquePointer?, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnOpenNetwork(id: COpaquePointer?, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryEndpointAddresses(endpoint: COpaquePointer?, query: Pcwstr, addresses: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryEndpointProperties(endpoint: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryEndpointStats(endpoint: COpaquePointer?, query: Pcwstr, stats: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryLoadBalancerProperties(loadbalancer: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryNamespaceProperties(namespace: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnQueryNetworkProperties(network: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult

public expect fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: COpaquePointer?, callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult

public expect fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult

public expect fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult

public expect fun hcnReserveGuestNetworkServicePort(guestnetworkservice: COpaquePointer?, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: COpaquePointer?): Hresult

public expect fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: COpaquePointer?, portcount: UShort, portrangereservation: COpaquePointer?, portreservationhandle: COpaquePointer?): Hresult

public expect fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: COpaquePointer?): Hresult

public expect fun hcnUnregisterServiceCallback(callbackhandle: COpaquePointer?): Hresult
