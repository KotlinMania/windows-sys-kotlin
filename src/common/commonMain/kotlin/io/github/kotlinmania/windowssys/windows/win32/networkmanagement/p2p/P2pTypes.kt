package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.p2p

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT

public typealias DRT_ADDRESS_FLAGS = Int

public fun interface DRT_BOOTSTRAP_RESOLVE_CALLBACKFn {
    public operator fun invoke(hr: HRESULT, pvcontext: Long, paddresses: Long, ffatalerror: BOOL)
}

public typealias DRT_BOOTSTRAP_RESOLVE_CALLBACK = DRT_BOOTSTRAP_RESOLVE_CALLBACKFn?

public typealias DRT_EVENT_TYPE = Int

public typealias DRT_LEAFSET_KEY_CHANGE_TYPE = Int

public typealias DRT_MATCH_TYPE = Int

public typealias DRT_REGISTRATION_STATE = Int

public typealias DRT_SCOPE = Int

public typealias DRT_SECURITY_MODE = Int

public typealias DRT_STATUS = Int

public typealias PEERDIST_CLIENT_INFO_BY_HANDLE_CLASS = Int

public typealias PEERDIST_RETRIEVAL_OPTIONS_CONTENTINFO_VERSION_VALUE = UInt

public typealias PEERDIST_STATUS = Int

public typealias PEER_APPLICATION_REGISTRATION_TYPE = Int

public typealias PEER_CHANGE_TYPE = Int

public typealias PEER_COLLAB_EVENT_TYPE = Int

public typealias PEER_CONNECTION_FLAGS = Int

public typealias PEER_CONNECTION_STATUS = Int

public typealias PEER_GRAPH_EVENT_TYPE = Int

public typealias PEER_GRAPH_PROPERTY_FLAGS = Int

public typealias PEER_GRAPH_SCOPE = Int

public typealias PEER_GRAPH_STATUS_FLAGS = Int

public typealias PEER_GROUP_AUTHENTICATION_SCHEME = Int

public typealias PEER_GROUP_EVENT_TYPE = Int

public typealias PEER_GROUP_ISSUE_CREDENTIAL_FLAGS = Int

public typealias PEER_GROUP_PROPERTY_FLAGS = Int

public typealias PEER_GROUP_STATUS = Int

public typealias PEER_INVITATION_RESPONSE_TYPE = Int

public typealias PEER_MEMBER_CHANGE_TYPE = Int

public typealias PEER_MEMBER_FLAGS = Int

public typealias PEER_NODE_CHANGE_TYPE = Int

public typealias PEER_PRESENCE_STATUS = Int

public typealias PEER_PUBLICATION_SCOPE = Int

public typealias PEER_RECORD_CHANGE_TYPE = Int

public typealias PEER_RECORD_FLAGS = Int

public typealias PEER_SIGNIN_FLAGS = Int

public typealias PEER_WATCH_PERMISSION = Int

public fun interface PFNPEER_FREE_SECURITY_DATAFn {
    public operator fun invoke(hgraph: Long, pvcontext: Long, psecuritydata: Long): HRESULT
}

public typealias PFNPEER_FREE_SECURITY_DATA = PFNPEER_FREE_SECURITY_DATAFn?

public fun interface PFNPEER_ON_PASSWORD_AUTH_FAILEDFn {
    public operator fun invoke(hgraph: Long, pvcontext: Long): HRESULT
}

public typealias PFNPEER_ON_PASSWORD_AUTH_FAILED = PFNPEER_ON_PASSWORD_AUTH_FAILEDFn?

public fun interface PFNPEER_SECURE_RECORDFn {
    public operator fun invoke(hgraph: Long, pvcontext: Long, precord: Long, changetype: PEER_RECORD_CHANGE_TYPE, ppsecuritydata: Long): HRESULT
}

public typealias PFNPEER_SECURE_RECORD = PFNPEER_SECURE_RECORDFn?

public fun interface PFNPEER_VALIDATE_RECORDFn {
    public operator fun invoke(hgraph: Long, pvcontext: Long, precord: Long, changetype: PEER_RECORD_CHANGE_TYPE): HRESULT
}

public typealias PFNPEER_VALIDATE_RECORD = PFNPEER_VALIDATE_RECORDFn?

public typealias PNRP_CLOUD_FLAGS = Int

public typealias PNRP_CLOUD_STATE = Int

public typealias PNRP_EXTENDED_PAYLOAD_TYPE = Int

public typealias PNRP_REGISTERED_ID_STATE = Int

public typealias PNRP_RESOLVE_CRITERIA = Int

public typealias PNRP_SCOPE = Int
