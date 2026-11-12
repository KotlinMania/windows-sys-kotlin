@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsGetObject
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem
import io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.LsaForestTrustInformation
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun aDsBuildEnumerator(padscontainer: MutPtr<CVoid>, ppenumvariant: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(padscontainer.rawAddress.toCPointer<ByteVar>(), ppenumvariant.rawAddress.toCPointer<ByteVar>())

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr<UInt>, dwobjecttypes: UInt, pvar: MutPtr<Variant.Variant>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(lpdwobjecttypes.rawAddress.toCPointer<ByteVar>(), dwobjecttypes, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun aDsBuildVarArrayStr(lpppathnames: ConstPtr<Pcwstr>, dwpathnames: UInt, pvar: MutPtr<Variant.Variant>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(lpppathnames.rawAddress.toCPointer<ByteVar>(), dwpathnames, pvar.rawAddress.toCPointer<ByteVar>())

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr<MutPtr<UByte>>, pdwdestlen: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(szsrcdata.rawAddress.toCPointer<ByteVar>(), ppbdestdata.rawAddress.toCPointer<ByteVar>(), pdwdestlen.rawAddress.toCPointer<ByteVar>())

public actual fun aDsEncodeBinaryData(pbsrcdata: MutPtr<UByte>, dwsrclen: UInt, ppszdestdata: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(pbsrcdata.rawAddress.toCPointer<ByteVar>(), dwsrclen, ppszdestdata.rawAddress.toCPointer<ByteVar>())

public actual fun aDsEnumerateNext(penumvariant: MutPtr<CVoid>, celements: UInt, pvar: MutPtr<Variant.Variant>, pcelementsfetched: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(penumvariant.rawAddress.toCPointer<ByteVar>(), celements, pvar.rawAddress.toCPointer<ByteVar>(), pcelementsfetched.rawAddress.toCPointer<ByteVar>())

public actual fun aDsFreeEnumerator(penumvariant: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(penumvariant.rawAddress.toCPointer<ByteVar>())

public actual fun aDsGetLastError(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(lperror.rawAddress.toCPointer<ByteVar>(), lperrorbuf.rawAddress.toCPointer<ByteVar>(), dwerrorbuflen, lpnamebuf.rawAddress.toCPointer<ByteVar>(), dwnamebuflen)

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(lpszpathname.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppobject.rawAddress.toCPointer<ByteVar>())

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr<Guid>, ppobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(lpszpathname.rawAddress.toCPointer<ByteVar>(), lpszusername.rawAddress.toCPointer<ByteVar>(), lpszpassword.rawAddress.toCPointer<ByteVar>(), dwreserved, riid.rawAddress.toCPointer<ByteVar>(), ppobject.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr<AdsAttrInfo>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(pwzattr.rawAddress.toCPointer<ByteVar>(), pwritableattrs.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr<CVoid>, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr<Hwnd>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(pappthddataobj.rawAddress.toCPointer<ByteVar>(), pwzadsobjname.rawAddress.toCPointer<ByteVar>(), phnotifyobj.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr<Adspropinitparams>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(hnotifyobj.rawAddress.toCPointer<ByteVar>(), pinitparams.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr<Adsproperror>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(hnotifyobj.rawAddress.toCPointer<ByteVar>(), perror.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(hnotifyobj.rawAddress.toCPointer<ByteVar>(), hpage.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr<Byte>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(hnotifyobj.rawAddress.toCPointer<ByteVar>(), hpage.rawAddress.toCPointer<ByteVar>(), ptztitle.rawAddress.toCPointer<ByteVar>())

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(hnotifyobj.rawAddress.toCPointer<ByteVar>(), hpage.rawAddress.toCPointer<ByteVar>())

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(dwerr, pszerror.rawAddress.toCPointer<ByteVar>(), pszprovider.rawAddress.toCPointer<ByteVar>())
}

public actual fun adsFreeAdsValues(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt) {
    windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(padsvalues.rawAddress.toCPointer<ByteVar>(), dwnumvalues)
}

public actual fun adsTypeToPropVariant(padsvalues: MutPtr<Adsvalue>, dwnumvalues: UInt, pvariant: MutPtr<Variant.Variant>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(padsvalues.rawAddress.toCPointer<ByteVar>(), dwnumvalues, pvariant.rawAddress.toCPointer<ByteVar>())

public actual fun allocADsMem(cb: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(cb)?.toLong() ?: 0L)

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(pstr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr<Variant.Variant>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), pvarsec.rawAddress.toCPointer<ByteVar>(), pszservername.rawAddress.toCPointer<ByteVar>(), username.rawAddress.toCPointer<ByteVar>(), password.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(hds.rawAddress.toCPointer<ByteVar>(), flags, srcdomain.rawAddress.toCPointer<ByteVar>(), srcprincipal.rawAddress.toCPointer<ByteVar>(), srcdomaincontroller.rawAddress.toCPointer<ByteVar>(), srcdomaincreds.rawAddress.toCPointer<ByteVar>(), dstdomain.rawAddress.toCPointer<ByteVar>(), dstprincipal.rawAddress.toCPointer<ByteVar>())

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr<CVoid>, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(hds.rawAddress.toCPointer<ByteVar>(), flags, srcdomain.rawAddress.toCPointer<ByteVar>(), srcprincipal.rawAddress.toCPointer<ByteVar>(), srcdomaincontroller.rawAddress.toCPointer<ByteVar>(), srcdomaincreds.rawAddress.toCPointer<ByteVar>(), dstdomain.rawAddress.toCPointer<ByteVar>(), dstprincipal.rawAddress.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(computername.rawAddress.toCPointer<ByteVar>(), entrycount, socketaddresses.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pstr>>, subnetnames: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(computername.rawAddress.toCPointer<ByteVar>(), entrycount, socketaddresses.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>(), subnetnames.rawAddress.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>, subnetnames: MutPtr<MutPtr<Pwstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(computername.rawAddress.toCPointer<ByteVar>(), entrycount, socketaddresses.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>(), subnetnames.rawAddress.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr<SocketAddress>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(computername.rawAddress.toCPointer<ByteVar>(), entrycount, socketaddresses.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindA(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(servername.rawAddress.toCPointer<ByteVar>(), annotation.rawAddress.toCPointer<ByteVar>(), instanceguid.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), bindflags, phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr<Guid>, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(servername.rawAddress.toCPointer<ByteVar>(), annotation.rawAddress.toCPointer<ByteVar>(), instanceguid.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), bindflags, phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(sitename.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(sitename.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindW(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), bindflags, phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), bindflags, phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr<CVoid>, serviceprincipalname: Pcwstr, phds: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(domaincontrollername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), authidentity.rawAddress.toCPointer<ByteVar>(), serviceprincipalname.rawAddress.toCPointer<ByteVar>(), phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(hds.rawAddress.toCPointer<ByteVar>(), ctimeoutsecs)

public actual fun dsBrowseForContainerA(pinfo: MutPtr<Dsbrowseinfoa>): Int =
    windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(pinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsBrowseForContainerW(pinfo: MutPtr<Dsbrowseinfow>): Int =
    windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(pinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcspnlength.rawAddress.toCPointer<ByteVar>(), pszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcspnlength.rawAddress.toCPointer<ByteVar>(), pszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcstr>, ppresult: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(hds.rawAddress.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr<Pcwstr>, ppresult: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(hds.rawAddress.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames.rawAddress.toCPointer<ByteVar>(), ppresult.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(pszspn.rawAddress.toCPointer<ByteVar>(), cspn, pcserviceclass.rawAddress.toCPointer<ByteVar>(), serviceclass.rawAddress.toCPointer<ByteVar>(), pcservicename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pinstanceport.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(pszspn.rawAddress.toCPointer<ByteVar>(), cspn, pcserviceclass.rawAddress.toCPointer<ByteVar>(), serviceclass.rawAddress.toCPointer<ByteVar>(), pcservicename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pinstanceport.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pportnumber: MutPtr<UShort>, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(pszspn.rawAddress.toCPointer<ByteVar>(), cspn, pchostname.rawAddress.toCPointer<ByteVar>(), hostname.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pportnumber.rawAddress.toCPointer<ByteVar>(), pcdomainname.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), pcrealmname.rawAddress.toCPointer<ByteVar>(), realmname.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr<UInt>, hostname: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pcportname: MutPtr<UInt>, portname: Pwstr, pcdomainname: MutPtr<UInt>, domainname: Pwstr, pcrealmname: MutPtr<UInt>, realmname: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(pszspn.rawAddress.toCPointer<ByteVar>(), cspn, pchostname.rawAddress.toCPointer<ByteVar>(), hostname.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pcportname.rawAddress.toCPointer<ByteVar>(), portname.rawAddress.toCPointer<ByteVar>(), pcdomainname.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), pcrealmname.rawAddress.toCPointer<ByteVar>(), realmname.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pstr, pcservicename: MutPtr<UInt>, servicename: Pstr, pcinstancename: MutPtr<UInt>, instancename: Pstr, pinstanceport: MutPtr<UShort>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(pszspn.rawAddress.toCPointer<ByteVar>(), pcserviceclass.rawAddress.toCPointer<ByteVar>(), serviceclass.rawAddress.toCPointer<ByteVar>(), pcservicename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pinstanceport.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr<UInt>, serviceclass: Pwstr, pcservicename: MutPtr<UInt>, servicename: Pwstr, pcinstancename: MutPtr<UInt>, instancename: Pwstr, pinstanceport: MutPtr<UShort>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(pszspn.rawAddress.toCPointer<ByteVar>(), pcserviceclass.rawAddress.toCPointer<ByteVar>(), serviceclass.rawAddress.toCPointer<ByteVar>(), pcservicename.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), pcinstancename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), pinstanceport.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(pszrdn.rawAddress.toCPointer<ByteVar>(), cchrdn, pguid.rawAddress.toCPointer<ByteVar>(), pedsmanglefor.rawAddress.toCPointer<ByteVar>())

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr<Guid>, pedsmanglefor: MutPtr<DsMangleFor>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(pszrdn.rawAddress.toCPointer<ByteVar>(), cchrdn, pguid.rawAddress.toCPointer<ByteVar>(), pedsmanglefor.rawAddress.toCPointer<ByteVar>())

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(servername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), dsaguid.rawAddress.toCPointer<ByteVar>(), dnshostname.rawAddress.toCPointer<ByteVar>())

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr<Guid>, dsaguid: ConstPtr<Guid>, dnshostname: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(servername.rawAddress.toCPointer<ByteVar>(), dnsdomainname.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), dsaguid.rawAddress.toCPointer<ByteVar>(), dnshostname.rawAddress.toCPointer<ByteVar>())

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsa>>, domaincount: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(servername.rawAddress.toCPointer<ByteVar>(), flags, domains.rawAddress.toCPointer<ByteVar>(), domaincount.rawAddress.toCPointer<ByteVar>())

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr<MutPtr<DsDomainTrustsw>>, domaincount: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(servername.rawAddress.toCPointer<ByteVar>(), flags, domains.rawAddress.toCPointer<ByteVar>(), domaincount.rawAddress.toCPointer<ByteVar>())

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(infolevel, cinfo, pinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr<CVoid>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(infolevel, cinfo, pinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeNameResultA(presult: ConstPtr<DsNameResulta>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(presult.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeNameResultW(presult: ConstPtr<DsNameResultw>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(presult.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreePasswordCredentials(authidentity: ConstPtr<CVoid>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(authidentity.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr<DsSchemaGuidMapa>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(pguidmap.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr<DsSchemaGuidMapw>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(pguidmap.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr<Pstr>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(cspn, rpszspn.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr<Pwstr>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(cspn, rpszspn.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(getdccontexthandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr<Guid>, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfoa>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(computername.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), sitename.rawAddress.toCPointer<ByteVar>(), flags, domaincontrollerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr<Guid>, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr<MutPtr<DomainControllerInfow>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(computername.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), sitename.rawAddress.toCPointer<ByteVar>(), flags, domaincontrollerinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(getdccontexthandle.rawAddress.toCPointer<ByteVar>(), sockaddresscount.rawAddress.toCPointer<ByteVar>(), sockaddresses.rawAddress.toCPointer<ByteVar>(), dnshostname.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr<UInt>, sockaddresses: MutPtr<MutPtr<SocketAddress>>, dnshostname: MutPtr<Pwstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(getdccontexthandle.rawAddress.toCPointer<ByteVar>(), sockaddresscount.rawAddress.toCPointer<ByteVar>(), sockaddresses.rawAddress.toCPointer<ByteVar>(), dnshostname.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(dnsname.rawAddress.toCPointer<ByteVar>(), optionflags, sitename.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), dnsforestname.rawAddress.toCPointer<ByteVar>(), dcflags, retgetdccontext.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr<Guid>, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(dnsname.rawAddress.toCPointer<ByteVar>(), optionflags, sitename.rawAddress.toCPointer<ByteVar>(), domainguid.rawAddress.toCPointer<ByteVar>(), dnsforestname.rawAddress.toCPointer<ByteVar>(), dcflags, retgetdccontext.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(servername.rawAddress.toCPointer<ByteVar>(), entrycount.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr<UInt>, sitenames: MutPtr<MutPtr<Pwstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(servername.rawAddress.toCPointer<ByteVar>(), entrycount.rawAddress.toCPointer<ByteVar>(), sitenames.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(hds.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), infolevel, pcout.rawAddress.toCPointer<ByteVar>(), ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr<UInt>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(hds.rawAddress.toCPointer<ByteVar>(), domainname.rawAddress.toCPointer<ByteVar>(), infolevel, pcout.rawAddress.toCPointer<ByteVar>(), ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(servername.rawAddress.toCPointer<ByteVar>(), trusteddomainname.rawAddress.toCPointer<ByteVar>(), flags, foresttrustinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(pszobjectclass.rawAddress.toCPointer<ByteVar>(), pszbuffer.rawAddress.toCPointer<ByteVar>(), cchbuffer)

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    MutPtr(windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(dwflags, pszobjectclass.rawAddress.toCPointer<ByteVar>(), cximage, cyimage)?.toLong() ?: 0L)

public actual fun dsGetRdnW(ppdn: MutPtr<Pwstr>, pcdn: MutPtr<UInt>, ppkey: MutPtr<Pwstr>, pckey: MutPtr<UInt>, ppval: MutPtr<Pwstr>, pcval: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(ppdn.rawAddress.toCPointer<ByteVar>(), pcdn.rawAddress.toCPointer<ByteVar>(), ppkey.rawAddress.toCPointer<ByteVar>(), pckey.rawAddress.toCPointer<ByteVar>(), ppval.rawAddress.toCPointer<ByteVar>(), pcval.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(computername.rawAddress.toCPointer<ByteVar>(), sitename.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr<Pwstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(computername.rawAddress.toCPointer<ByteVar>(), sitename.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(servicetype, serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames.rawAddress.toCPointer<ByteVar>(), pinstanceports.rawAddress.toCPointer<ByteVar>(), pcspn.rawAddress.toCPointer<ByteVar>(), prpszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr<Pcwstr>, pinstanceports: ConstPtr<UShort>, pcspn: MutPtr<UInt>, prpszspn: MutPtr<MutPtr<Pwstr>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(servicetype, serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames.rawAddress.toCPointer<ByteVar>(), pinstanceports.rawAddress.toCPointer<ByteVar>(), pcspn.rawAddress.toCPointer<ByteVar>(), prpszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(hds.rawAddress.toCPointer<ByteVar>(), flags, srcprincipal.rawAddress.toCPointer<ByteVar>(), dstprincipal.rawAddress.toCPointer<ByteVar>())

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(hds.rawAddress.toCPointer<ByteVar>(), flags, srcprincipal.rawAddress.toCPointer<ByteVar>(), dstprincipal.rawAddress.toCPointer<ByteVar>())

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(pszdn.rawAddress.toCPointer<ByteVar>(), edsmanglefor)

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(pszdn.rawAddress.toCPointer<ByteVar>(), edsmanglefor)

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(pszrdn.rawAddress.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(pszrdn.rawAddress.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(hds.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppdomains.rawAddress.toCPointer<ByteVar>())

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(hds.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppdomains.rawAddress.toCPointer<ByteVar>())

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(hds.rawAddress.toCPointer<ByteVar>(), server.rawAddress.toCPointer<ByteVar>(), ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(hds.rawAddress.toCPointer<ByteVar>(), server.rawAddress.toCPointer<ByteVar>(), ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsListRolesA(hds: Handle, pproles: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(hds.rawAddress.toCPointer<ByteVar>(), pproles.rawAddress.toCPointer<ByteVar>())

public actual fun dsListRolesW(hds: Handle, pproles: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(hds.rawAddress.toCPointer<ByteVar>(), pproles.rawAddress.toCPointer<ByteVar>())

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(hds.rawAddress.toCPointer<ByteVar>(), domain.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppservers.rawAddress.toCPointer<ByteVar>())

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(hds.rawAddress.toCPointer<ByteVar>(), domain.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppservers.rawAddress.toCPointer<ByteVar>())

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(hds.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppservers.rawAddress.toCPointer<ByteVar>())

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(hds.rawAddress.toCPointer<ByteVar>(), site.rawAddress.toCPointer<ByteVar>(), ppservers.rawAddress.toCPointer<ByteVar>())

public actual fun dsListSitesA(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResulta>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(hds.rawAddress.toCPointer<ByteVar>(), ppsites.rawAddress.toCPointer<ByteVar>())

public actual fun dsListSitesW(hds: Handle, ppsites: MutPtr<MutPtr<DsNameResultw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(hds.rawAddress.toCPointer<ByteVar>(), ppsites.rawAddress.toCPointer<ByteVar>())

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(user.rawAddress.toCPointer<ByteVar>(), domain.rawAddress.toCPointer<ByteVar>(), password.rawAddress.toCPointer<ByteVar>(), pauthidentity.rawAddress.toCPointer<ByteVar>())

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(user.rawAddress.toCPointer<ByteVar>(), domain.rawAddress.toCPointer<ByteVar>(), password.rawAddress.toCPointer<ByteVar>(), pauthidentity.rawAddress.toCPointer<ByteVar>())

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr<UInt>, pszspn: Pstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), instanceport, referrer.rawAddress.toCPointer<ByteVar>(), pcspnlength.rawAddress.toCPointer<ByteVar>(), pszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr<UInt>, pszspn: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(serviceclass.rawAddress.toCPointer<ByteVar>(), servicename.rawAddress.toCPointer<ByteVar>(), instancename.rawAddress.toCPointer<ByteVar>(), instanceport, referrer.rawAddress.toCPointer<ByteVar>(), pcspnlength.rawAddress.toCPointer<ByteVar>(), pszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapa>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(hds.rawAddress.toCPointer<ByteVar>(), cguids, rguids.rawAddress.toCPointer<ByteVar>(), ppguidmap.rawAddress.toCPointer<ByteVar>())

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr<Guid>, ppguidmap: MutPtr<MutPtr<DsSchemaGuidMapw>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(hds.rawAddress.toCPointer<ByteVar>(), cguids, rguids.rawAddress.toCPointer<ByteVar>(), ppguidmap.rawAddress.toCPointer<ByteVar>())

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr<LsaForestTrustInformation>, oldforesttrustinfo: ConstPtr<LsaForestTrustInformation>, mergedforesttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(domainname.rawAddress.toCPointer<ByteVar>(), newforesttrustinfo.rawAddress.toCPointer<ByteVar>(), oldforesttrustinfo.rawAddress.toCPointer<ByteVar>(), mergedforesttrustinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr<Pcstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(hds.rawAddress.toCPointer<ByteVar>(), pszfromsite.rawAddress.toCPointer<ByteVar>(), rgsztosites.rawAddress.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr<Pcwstr>, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr<MutPtr<DsSiteCostInfo>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(hds.rawAddress.toCPointer<ByteVar>(), pwszfromsite.rawAddress.toCPointer<ByteVar>(), rgwsztosites.rawAddress.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsQuerySitesFree(rgsiteinfo: ConstPtr<DsSiteCostInfo>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(rgsiteinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(cunquotedrdnvaluelength, psunquotedrdnvalue.rawAddress.toCPointer<ByteVar>(), pcquotedrdnvaluelength.rawAddress.toCPointer<ByteVar>(), psquotedrdnvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr<UInt>, psquotedrdnvalue: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(cunquotedrdnvaluelength, psunquotedrdnvalue.rawAddress.toCPointer<ByteVar>(), pcquotedrdnvaluelength.rawAddress.toCPointer<ByteVar>(), psquotedrdnvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(hds.rawAddress.toCPointer<ByteVar>(), domaindn.rawAddress.toCPointer<ByteVar>())

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(hds.rawAddress.toCPointer<ByteVar>(), domaindn.rawAddress.toCPointer<ByteVar>())

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(hds.rawAddress.toCPointer<ByteVar>(), serverdn.rawAddress.toCPointer<ByteVar>(), domaindn.rawAddress.toCPointer<ByteVar>(), flastdcindomain.rawAddress.toCPointer<ByteVar>(), fcommit)

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr<Bool>, fcommit: Bool): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(hds.rawAddress.toCPointer<ByteVar>(), serverdn.rawAddress.toCPointer<ByteVar>(), domaindn.rawAddress.toCPointer<ByteVar>(), flastdcindomain.rawAddress.toCPointer<ByteVar>(), fcommit)

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), sourcedsadn.rawAddress.toCPointer<ByteVar>(), transportdn.rawAddress.toCPointer<ByteVar>(), sourcedsaaddress.rawAddress.toCPointer<ByteVar>(), pschedule.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), sourcedsadn.rawAddress.toCPointer<ByteVar>(), transportdn.rawAddress.toCPointer<ByteVar>(), sourcedsaaddress.rawAddress.toCPointer<ByteVar>(), pschedule.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(hds.rawAddress.toCPointer<ByteVar>(), taskid, dwflags)

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), dsasrc.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), dsasrc.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr<CVoid>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(infotype, pinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(hds.rawAddress.toCPointer<ByteVar>(), infotype, pszobject.rawAddress.toCPointer<ByteVar>(), puuidforsourcedsaobjguid.rawAddress.toCPointer<ByteVar>(), pszattributename.rawAddress.toCPointer<ByteVar>(), pszvalue.rawAddress.toCPointer<ByteVar>(), dwflags, dwenumerationcontext, ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr<Guid>, ppinfo: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(hds.rawAddress.toCPointer<ByteVar>(), infotype, pszobject.rawAddress.toCPointer<ByteVar>(), puuidforsourcedsaobjguid.rawAddress.toCPointer<ByteVar>(), ppinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuidsourcedsa.rawAddress.toCPointer<ByteVar>(), transportdn.rawAddress.toCPointer<ByteVar>(), sourcedsaaddress.rawAddress.toCPointer<ByteVar>(), pschedule.rawAddress.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr<Guid>, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr<Schedule>, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuidsourcedsa.rawAddress.toCPointer<ByteVar>(), transportdn.rawAddress.toCPointer<ByteVar>(), sourcedsaaddress.rawAddress.toCPointer<ByteVar>(), pschedule.rawAddress.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuiddsasrc.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfoa>>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(hds.rawAddress.toCPointer<ByteVar>(), psznamecontext.rawAddress.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata.rawAddress.toCPointer<ByteVar>(), perrors.rawAddress.toCPointer<ByteVar>())

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr<CVoid>, perrors: MutPtr<MutPtr<MutPtr<DsRepsyncallErrinfow>>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(hds.rawAddress.toCPointer<ByteVar>(), psznamecontext.rawAddress.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata.rawAddress.toCPointer<ByteVar>(), perrors.rawAddress.toCPointer<ByteVar>())

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuiddsasrc.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), dsadest.rawAddress.toCPointer<ByteVar>(), puuiddsadest.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr<Guid>, options: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), dsadest.rawAddress.toCPointer<ByteVar>(), puuiddsadest.rawAddress.toCPointer<ByteVar>(), options)

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuiddsasrc.rawAddress.toCPointer<ByteVar>(), uloptions)

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr<Guid>, uloptions: UInt): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(hds.rawAddress.toCPointer<ByteVar>(), namecontext.rawAddress.toCPointer<ByteVar>(), puuiddsasrc.rawAddress.toCPointer<ByteVar>(), uloptions)

public actual fun dsRoleFreeMemory(buffer: MutPtr<CVoid>) {
    windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(buffer.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr<MutPtr<UByte>>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(lpserver.rawAddress.toCPointer<ByteVar>(), infolevel, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(operation, serviceclass.rawAddress.toCPointer<ByteVar>(), userobjectdn.rawAddress.toCPointer<ByteVar>())

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(operation, serviceclass.rawAddress.toCPointer<ByteVar>(), userobjectdn.rawAddress.toCPointer<ByteVar>())

public actual fun dsUnBindA(phds: ConstPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsUnBindW(phds: ConstPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(phds.rawAddress.toCPointer<ByteVar>())

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(cquotedrdnvaluelength, psquotedrdnvalue.rawAddress.toCPointer<ByteVar>(), pcunquotedrdnvaluelength.rawAddress.toCPointer<ByteVar>(), psunquotedrdnvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr<UInt>, psunquotedrdnvalue: Pwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(cquotedrdnvaluelength, psquotedrdnvalue.rawAddress.toCPointer<ByteVar>(), pcunquotedrdnvaluelength.rawAddress.toCPointer<ByteVar>(), psunquotedrdnvalue.rawAddress.toCPointer<ByteVar>())

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(subnetname.rawAddress.toCPointer<ByteVar>())

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(subnetname.rawAddress.toCPointer<ByteVar>())

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr<Pcstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(hds.rawAddress.toCPointer<ByteVar>(), operation, pszaccount.rawAddress.toCPointer<ByteVar>(), cspn, rpszspn.rawAddress.toCPointer<ByteVar>())

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr<Pcwstr>): UInt =
    windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(hds.rawAddress.toCPointer<ByteVar>(), operation, pszaccount.rawAddress.toCPointer<ByteVar>(), cspn, rpszspn.rawAddress.toCPointer<ByteVar>())

public actual fun freeADsMem(pmem: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(pmem.rawAddress.toCPointer<ByteVar>())

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(pstr.rawAddress.toCPointer<ByteVar>())

public actual fun propVariantToAdsType(pvariant: MutPtr<Variant.Variant>, dwnumvariant: UInt, ppadsvalues: MutPtr<MutPtr<Adsvalue>>, pdwnumvalues: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(pvariant.rawAddress.toCPointer<ByteVar>(), dwnumvariant, ppadsvalues.rawAddress.toCPointer<ByteVar>(), pdwnumvalues.rawAddress.toCPointer<ByteVar>())

public actual fun reallocADsMem(poldmem: MutPtr<CVoid>, cbold: UInt, cbnew: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(poldmem.rawAddress.toCPointer<ByteVar>(), cbold, cbnew)?.toLong() ?: 0L)

public actual fun reallocADsStr(ppstr: MutPtr<Pwstr>, pstr: Pcwstr): Bool =
    windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(ppstr.rawAddress.toCPointer<ByteVar>(), pstr.rawAddress.toCPointer<ByteVar>())

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant.Variant, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, pdwsdlength: MutPtr<UInt>, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    0
