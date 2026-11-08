package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(notificationtype: UInt, context: Long, notificationstatus: HRESULT, notificationdata: PCWSTR)
}

public fun HcnCloseEndpoint(endpoint: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCloseEndpoint", longArrayOf(endpoint)).toInt()
}

public fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCloseGuestNetworkService", longArrayOf(guestnetworkservice)).toInt()
}

public fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCloseLoadBalancer", longArrayOf(loadbalancer)).toInt()
}

public fun HcnCloseNamespace(namespace: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCloseNamespace", longArrayOf(namespace)).toInt()
}

public fun HcnCloseNetwork(network: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCloseNetwork", longArrayOf(network)).toInt()
}

public fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCreateEndpoint", longArrayOf(network, id, settings, endpoint, errorrecord)).toInt()
}

public fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCreateGuestNetworkService", longArrayOf(id, settings, guestnetworkservice, errorrecord)).toInt()
}

public fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCreateLoadBalancer", longArrayOf(id, settings, loadbalancer, errorrecord)).toInt()
}

public fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCreateNamespace", longArrayOf(id, settings, namespace, errorrecord)).toInt()
}

public fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnCreateNetwork", longArrayOf(id, settings, network, errorrecord)).toInt()
}

public fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnDeleteEndpoint", longArrayOf(id, errorrecord)).toInt()
}

public fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnDeleteGuestNetworkService", longArrayOf(id, errorrecord)).toInt()
}

public fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnDeleteLoadBalancer", longArrayOf(id, errorrecord)).toInt()
}

public fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnDeleteNamespace", longArrayOf(id, errorrecord)).toInt()
}

public fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnDeleteNetwork", longArrayOf(id, errorrecord)).toInt()
}

public fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnEnumerateEndpoints", longArrayOf(query, endpoints, errorrecord)).toInt()
}

public fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnEnumerateGuestNetworkPortReservations", longArrayOf(returncount, portentries)).toInt()
}

public fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnEnumerateLoadBalancers", longArrayOf(query, loadbalancer, errorrecord)).toInt()
}

public fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnEnumerateNamespaces", longArrayOf(query, namespaces, errorrecord)).toInt()
}

public fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnEnumerateNetworks", longArrayOf(query, networks, errorrecord)).toInt()
}

public fun HcnFreeGuestNetworkPortReservations(portentries: Long) {
    Win32DynamicFfi.invoke("computenetwork.dll", "HcnFreeGuestNetworkPortReservations", longArrayOf(portentries))
}

public fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnModifyEndpoint", longArrayOf(endpoint, settings, errorrecord)).toInt()
}

public fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnModifyGuestNetworkService", longArrayOf(guestnetworkservice, settings, errorrecord)).toInt()
}

public fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnModifyLoadBalancer", longArrayOf(loadbalancer, settings, errorrecord)).toInt()
}

public fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnModifyNamespace", longArrayOf(namespace, settings, errorrecord)).toInt()
}

public fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnModifyNetwork", longArrayOf(network, settings, errorrecord)).toInt()
}

public fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnOpenEndpoint", longArrayOf(id, endpoint, errorrecord)).toInt()
}

public fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnOpenLoadBalancer", longArrayOf(id, loadbalancer, errorrecord)).toInt()
}

public fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnOpenNamespace", longArrayOf(id, namespace, errorrecord)).toInt()
}

public fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnOpenNetwork", longArrayOf(id, network, errorrecord)).toInt()
}

public fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryEndpointAddresses", longArrayOf(endpoint, query, addresses, errorrecord)).toInt()
}

public fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryEndpointProperties", longArrayOf(endpoint, query, properties, errorrecord)).toInt()
}

public fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryEndpointStats", longArrayOf(endpoint, query, stats, errorrecord)).toInt()
}

public fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryLoadBalancerProperties", longArrayOf(loadbalancer, query, properties, errorrecord)).toInt()
}

public fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryNamespaceProperties", longArrayOf(namespace, query, properties, errorrecord)).toInt()
}

public fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnQueryNetworkProperties", longArrayOf(network, query, properties, errorrecord)).toInt()
}

public fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnRegisterGuestNetworkServiceCallback", longArrayOf(guestnetworkservice, Win32DynamicFfi.objectSlot(callback), context, callbackhandle)).toInt()
}

public fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnRegisterServiceCallback", longArrayOf(Win32DynamicFfi.objectSlot(callback), context, callbackhandle)).toInt()
}

public fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnReleaseGuestNetworkServicePortReservationHandle", longArrayOf(portreservationhandle)).toInt()
}

public fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnReserveGuestNetworkServicePort", longArrayOf(guestnetworkservice, protocol.toLong(), access.toLong(), port.toLong(), portreservationhandle)).toInt()
}

public fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnReserveGuestNetworkServicePortRange", longArrayOf(guestnetworkservice, portcount.toLong(), portrangereservation, portreservationhandle)).toInt()
}

public fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnUnregisterGuestNetworkServiceCallback", longArrayOf(callbackhandle)).toInt()
}

public fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("computenetwork.dll", "HcnUnregisterServiceCallback", longArrayOf(callbackhandle)).toInt()
}
