@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerAllocT
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerBvdup
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerBvecfree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerBvfree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerFirstElement
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerFlatten
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerFree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerInit
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerNextElement
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerPeekTag
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerPrintf
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerScanf
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapBerSkipTag
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapCldapOpen
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapCldapOpenA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapCldapOpenW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAbandon
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAdd
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapAddW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBind
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBindA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBindS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBindSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBindSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapBindW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCheckFilterA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCheckFilterW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCleanup
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompare
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCompareW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapConnFromMsg
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapConnect
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlFree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlFreeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlFreeW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlsFree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlsFreeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapControlsFreeW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountEntries
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountReferences
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountValues
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountValuesA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountValuesLen
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCountValuesW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreatePageControl
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreateSortControl
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDelete
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDeleteW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDn2ufn
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDn2ufnA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapDn2ufnW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapErr2string
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapErr2stringA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapErr2stringW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExplodeDn
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExplodeDnA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExplodeDnW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExtendedOperation
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFirstAttribute
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFirstEntry
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFirstReference
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFreeControls
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFreeControlsA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapFreeControlsW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetDn
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetDnA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetDnW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetLastError
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetNextPage
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetNextPageS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetOption
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetOptionW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetPagedCount
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValues
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValuesA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValuesLen
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapGetValuesW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapInit
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapInitA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapInitW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapMemfree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapMemfreeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapMemfreeW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModify
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifySA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifySW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModifyW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2A
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2S
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2SA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2SW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdn2W
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdnA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdnS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdnSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdnSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapModrdnW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapMsgfree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapNextAttribute
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapNextAttributeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapNextAttributeW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapNextEntry
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapNextReference
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapOpen
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapOpenA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapOpenW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParsePageControl
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParsePageControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParsePageControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseReference
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseReferenceA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseReferenceW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseResult
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseResultA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseResultW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseSortControl
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseSortControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseSortControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapPerror
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapRenameExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapResult
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapResult2error
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSaslBindA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSaslBindSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSaslBindSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSaslBindW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearch
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExtA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExtS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExtSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExtSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchExtW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchInitPage
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchSt
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchStA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchStW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSearchW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSetOption
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSetOptionW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBind
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBindA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBindS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSimpleBindW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSslinit
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSslinitA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapSslinitW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapStartTlsSA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapStartTlsSW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapStartup
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapStopTlsS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUfn2dn
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUfn2dnA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUfn2dnW
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUnbind
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUnbindS
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapValueFree
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapValueFreeA
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapValueFreeLen
import io.github.kotlinmania.windowssys.windows.win32.networking.ldap.cinterop.windowssysWindowsWin32NetworkingLdapLdapValueFreeW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ldapGetLastError(): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetLastError()

public actual fun ldapMapErrorToWin32(ldaperror: UInt): Win32Error =
    windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(ldaperror)

public actual fun ldapUTF8ToUnicode(lpsrcstr: Pcstr, cchsrc: Int, lpdeststr: Pwstr, cchdest: Int): Int =
    windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(lpsrcstr.rawAddress.toCPointer<ByteVar>(), cchsrc, lpdeststr.rawAddress.toCPointer<ByteVar>(), cchdest)

public actual fun ldapUnicodeToUTF8(lpsrcstr: Pcwstr, cchsrc: Int, lpdeststr: Pstr, cchdest: Int): Int =
    windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(lpsrcstr.rawAddress.toCPointer<ByteVar>(), cchsrc, lpdeststr.rawAddress.toCPointer<ByteVar>(), cchdest)

public actual fun berAllocT(options: Int): MutPtr<BerElement> =
    MutPtr(windowssysWindowsWin32NetworkingLdapBerAllocT(options)?.toLong() ?: 0L)

public actual fun berBvdup(pberval: MutPtr<LdapBerval>): MutPtr<LdapBerval> =
    MutPtr(windowssysWindowsWin32NetworkingLdapBerBvdup(pberval.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun berBvecfree(pberval: MutPtr<MutPtr<LdapBerval>>) {
    windowssysWindowsWin32NetworkingLdapBerBvecfree(pberval.rawAddress.toCPointer<ByteVar>())
}

public actual fun berBvfree(bv: MutPtr<LdapBerval>) {
    windowssysWindowsWin32NetworkingLdapBerBvfree(bv.rawAddress.toCPointer<ByteVar>())
}

public actual fun berFirstElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, ppopaque: MutPtr<MutPtr<Byte>>): UInt =
    windowssysWindowsWin32NetworkingLdapBerFirstElement(pberelement.rawAddress.toCPointer<ByteVar>(), plen.rawAddress.toCPointer<ByteVar>(), ppopaque.rawAddress.toCPointer<ByteVar>())

public actual fun berFlatten(pberelement: MutPtr<BerElement>, pberval: MutPtr<MutPtr<LdapBerval>>): Int =
    windowssysWindowsWin32NetworkingLdapBerFlatten(pberelement.rawAddress.toCPointer<ByteVar>(), pberval.rawAddress.toCPointer<ByteVar>())

public actual fun berFree(pberelement: MutPtr<BerElement>, fbuf: Int) {
    windowssysWindowsWin32NetworkingLdapBerFree(pberelement.rawAddress.toCPointer<ByteVar>(), fbuf)
}

public actual fun berInit(pberval: MutPtr<LdapBerval>): MutPtr<BerElement> =
    MutPtr(windowssysWindowsWin32NetworkingLdapBerInit(pberval.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun berNextElement(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>, opaque: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapBerNextElement(pberelement.rawAddress.toCPointer<ByteVar>(), plen.rawAddress.toCPointer<ByteVar>(), opaque.rawAddress.toCPointer<ByteVar>())

public actual fun berPeekTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapBerPeekTag(pberelement.rawAddress.toCPointer<ByteVar>(), plen.rawAddress.toCPointer<ByteVar>())

public actual fun berPrintf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): Int =
    windowssysWindowsWin32NetworkingLdapBerPrintf(pberelement.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berScanf(pberelement: MutPtr<BerElement>, fmt: Pcstr, vararg variadicArgs: Long): UInt =
    windowssysWindowsWin32NetworkingLdapBerScanf(pberelement.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun berSkipTag(pberelement: MutPtr<BerElement>, plen: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapBerSkipTag(pberelement.rawAddress.toCPointer<ByteVar>(), plen.rawAddress.toCPointer<ByteVar>())

public actual fun cldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapCldapOpen(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun cldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapCldapOpenA(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun cldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapCldapOpenW(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapAbandon(ld: MutPtr<Ldap>, msgid: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAbandon(ld.rawAddress.toCPointer<ByteVar>(), msgid)

public actual fun ldapAdd(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAdd(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExt(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExt(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExtA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExtA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExtW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExtS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExtS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExtSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddExtSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddS(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddSA(ld: MutPtr<Ldap>, dn: Pcstr, attrs: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapAddSW(ld: MutPtr<Ldap>, dn: Pcwstr, attrs: MutPtr<MutPtr<LDAPModW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapAddSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>())

public actual fun ldapBind(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBind(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapBindA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBindA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapBindW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBindW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapBindS(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBindS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapBindSA(ld: MutPtr<Ldap>, dn: Pcstr, cred: Pcstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBindSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, cred: Pcwstr, method: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapBindSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), method)

public actual fun ldapCheckFilterA(ld: MutPtr<Ldap>, searchfilter: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(ld.rawAddress.toCPointer<ByteVar>(), searchfilter.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCheckFilterW(ld: MutPtr<Ldap>, searchfilter: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(ld.rawAddress.toCPointer<ByteVar>(), searchfilter.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCleanup(hinstance: Handle): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCleanup(hinstance.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCloseExtendedOp(ld: MutPtr<Ldap>, messagenumber: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(ld.rawAddress.toCPointer<ByteVar>(), messagenumber)

public actual fun ldapCompare(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompare(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExt(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExt(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExtA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExtA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExtW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExtW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExtS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExtS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExtSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr, data: ConstPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareS(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareSA(ld: MutPtr<Ldap>, dn: Pcstr, attr: Pcstr, value: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCompareSW(ld: MutPtr<Ldap>, dn: Pcwstr, attr: Pcwstr, value: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCompareSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun ldapConnFromMsg(primaryconn: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(primaryconn.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapConnect(ld: MutPtr<Ldap>, timeout: MutPtr<LdapTimeval>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapConnect(ld.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlFree(control: MutPtr<LDAPControlA>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlFree(control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlFreeA(controls: MutPtr<LDAPControlA>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlFreeA(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlFreeW(control: MutPtr<LDAPControlW>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlFreeW(control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlsFree(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlsFree(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlsFreeA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapControlsFreeW(control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountEntries(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountEntries(ld.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountReferences(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountReferences(ld.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountValues(vals: ConstPtr<Pcstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountValues(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountValuesA(vals: ConstPtr<Pcstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountValuesA(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountValuesW(vals: ConstPtr<Pcwstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountValuesW(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCountValuesLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreatePageControl(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(externalhandle.rawAddress.toCPointer<ByteVar>(), pagesize, cookie.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreatePageControlA(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), pagesize, cookie.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreatePageControlW(externalhandle: MutPtr<Ldap>, pagesize: UInt, cookie: MutPtr<LdapBerval>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), pagesize, cookie.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreateSortControl(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(externalhandle.rawAddress.toCPointer<ByteVar>(), sortkeys.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreateSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), sortkeys.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreateSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), sortkeys.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreateVlvControlA(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlA>>): Int =
    windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), vlvinfo.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapCreateVlvControlW(externalhandle: MutPtr<Ldap>, vlvinfo: MutPtr<LDAPVLVInfo>, iscritical: UByte, control: MutPtr<MutPtr<LDAPControlW>>): Int =
    windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), vlvinfo.rawAddress.toCPointer<ByteVar>(), iscritical, control.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDelete(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDelete(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExt(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExt(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExtA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExtW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExtS(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExtSA(ld: MutPtr<Ldap>, dn: Pcstr, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteS(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteSA(ld: MutPtr<Ldap>, dn: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDeleteSW(ld: MutPtr<Ldap>, dn: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapDeleteSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapDn2ufn(dn: Pcstr): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapDn2ufn(dn.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapDn2ufnA(dn: Pcstr): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(dn.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapDn2ufnW(dn: Pcwstr): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(dn.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapEncodeSortControlA(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>, control: MutPtr<LDAPControlA>, criticality: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), sortkeys.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), criticality)

public actual fun ldapEncodeSortControlW(externalhandle: MutPtr<Ldap>, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>, control: MutPtr<LDAPControlW>, criticality: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), sortkeys.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), criticality)

public actual fun ldapErr2string(err: UInt): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapErr2string(err)?.toLong() ?: 0L)

public actual fun ldapErr2stringA(err: UInt): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapErr2stringA(err)?.toLong() ?: 0L)

public actual fun ldapErr2stringW(err: UInt): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapErr2stringW(err)?.toLong() ?: 0L)

public actual fun ldapEscapeFilterElement(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(sourcefilterelement.rawAddress.toCPointer<ByteVar>(), sourcelength, destfilterelement.rawAddress.toCPointer<ByteVar>(), destlength)

public actual fun ldapEscapeFilterElementA(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pstr, destlength: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(sourcefilterelement.rawAddress.toCPointer<ByteVar>(), sourcelength, destfilterelement.rawAddress.toCPointer<ByteVar>(), destlength)

public actual fun ldapEscapeFilterElementW(sourcefilterelement: Pcstr, sourcelength: UInt, destfilterelement: Pwstr, destlength: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(sourcefilterelement.rawAddress.toCPointer<ByteVar>(), sourcelength, destfilterelement.rawAddress.toCPointer<ByteVar>(), destlength)

public actual fun ldapExplodeDn(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapExplodeDn(dn.rawAddress.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L)

public actual fun ldapExplodeDnA(dn: Pcstr, notypes: UInt): MutPtr<Pstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(dn.rawAddress.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L)

public actual fun ldapExplodeDnW(dn: Pcwstr, notypes: UInt): MutPtr<Pwstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(dn.rawAddress.toCPointer<ByteVar>(), notypes)?.toLong() ?: 0L)

public actual fun ldapExtendedOperation(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(ld.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationA(ld: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(ld.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationW(ld: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(ld.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationSA(externalhandle: MutPtr<Ldap>, oid: Pcstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, returnedoid: MutPtr<Pstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(externalhandle.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), returnedoid.rawAddress.toCPointer<ByteVar>(), returneddata.rawAddress.toCPointer<ByteVar>())

public actual fun ldapExtendedOperationSW(externalhandle: MutPtr<Ldap>, oid: Pcwstr, data: MutPtr<LdapBerval>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, returnedoid: MutPtr<Pwstr>, returneddata: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(externalhandle.rawAddress.toCPointer<ByteVar>(), oid.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), returnedoid.rawAddress.toCPointer<ByteVar>(), returneddata.rawAddress.toCPointer<ByteVar>())

public actual fun ldapFirstAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapFirstAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapFirstAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<MutPtr<BerElement>>): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapFirstEntry(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapFirstEntry(ld.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapFirstReference(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapFirstReference(ld.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapFreeControls(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapFreeControls(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapFreeControlsA(controls: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapFreeControlsW(controls: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(controls.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetDn(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetDn(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetDnA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetDnA(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetDnW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetDnW(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetNextPage(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, pagesize: UInt, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetNextPage(externalhandle.rawAddress.toCPointer<ByteVar>(), searchhandle, pagesize, messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetNextPageS(externalhandle: MutPtr<Ldap>, searchhandle: PLDAPSearch, timeout: MutPtr<LdapTimeval>, pagesize: UInt, totalcount: MutPtr<UInt>, results: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(externalhandle.rawAddress.toCPointer<ByteVar>(), searchhandle, timeout.rawAddress.toCPointer<ByteVar>(), pagesize, totalcount.rawAddress.toCPointer<ByteVar>(), results.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetOption(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetOption(ld.rawAddress.toCPointer<ByteVar>(), option, outvalue.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetOptionW(ld: MutPtr<Ldap>, option: Int, outvalue: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetOptionW(ld.rawAddress.toCPointer<ByteVar>(), option, outvalue.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetPagedCount(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch, totalcount: MutPtr<UInt>, results: MutPtr<LDAPMessage>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(externalhandle.rawAddress.toCPointer<ByteVar>(), searchblock, totalcount.rawAddress.toCPointer<ByteVar>(), results.rawAddress.toCPointer<ByteVar>())

public actual fun ldapGetValues(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValues(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetValuesA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<Pstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValuesA(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetValuesW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<Pwstr> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValuesW(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetValuesLen(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(externalhandle.rawAddress.toCPointer<ByteVar>(), message.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetValuesLenA(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcstr): MutPtr<MutPtr<LdapBerval>> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(externalhandle.rawAddress.toCPointer<ByteVar>(), message.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapGetValuesLenW(externalhandle: MutPtr<Ldap>, message: MutPtr<LDAPMessage>, attr: Pcwstr): MutPtr<MutPtr<LdapBerval>> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(externalhandle.rawAddress.toCPointer<ByteVar>(), message.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapInit(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapInit(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapInitA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapInitA(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapInitW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapInitW(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapMemfree(block: Pcstr) {
    windowssysWindowsWin32NetworkingLdapLdapMemfree(block.rawAddress.toCPointer<ByteVar>())
}

public actual fun ldapMemfreeA(block: Pcstr) {
    windowssysWindowsWin32NetworkingLdapLdapMemfreeA(block.rawAddress.toCPointer<ByteVar>())
}

public actual fun ldapMemfreeW(block: Pcwstr) {
    windowssysWindowsWin32NetworkingLdapLdapMemfreeW(block.rawAddress.toCPointer<ByteVar>())
}

public actual fun ldapModify(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModify(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExt(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExt(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExtA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExtA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExtW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExtW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExtS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExtS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExtSA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifyS(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifyS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifySA(ld: MutPtr<Ldap>, dn: Pcstr, mods: MutPtr<MutPtr<LDAPModA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifySA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModifySW(ld: MutPtr<Ldap>, dn: Pcwstr, mods: MutPtr<MutPtr<LDAPModW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModifySW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), mods.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdn(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdn2(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2A(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2A(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2W(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2W(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2S(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2S(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2SA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdn2SW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr, deleteoldrdn: Int): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>(), deleteoldrdn)

public actual fun ldapModrdnA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdnA(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdnW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdnW(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdnS(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdnS(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdnSA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, newdistinguishedname: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdnSA(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapModrdnSW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, newdistinguishedname: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapModrdnSW(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), newdistinguishedname.rawAddress.toCPointer<ByteVar>())

public actual fun ldapMsgfree(res: MutPtr<LDAPMessage>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapMsgfree(res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapNextAttribute(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapNextAttribute(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapNextAttributeA(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapNextAttributeW(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>, ptr: MutPtr<BerElement>): Pwstr =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>(), ptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapNextEntry(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapNextEntry(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapNextReference(ld: MutPtr<Ldap>, entry: MutPtr<LDAPMessage>): MutPtr<LDAPMessage> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapNextReference(ld.rawAddress.toCPointer<ByteVar>(), entry.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ldapOpen(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapOpen(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapOpenA(hostname: Pcstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapOpenA(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapOpenW(hostname: Pcwstr, portnumber: UInt): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapOpenW(hostname.rawAddress.toCPointer<ByteVar>(), portnumber)?.toLong() ?: 0L)

public actual fun ldapParseExtendedResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), resultoid.rawAddress.toCPointer<ByteVar>(), resultdata.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseExtendedResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, resultoid: MutPtr<Pwstr>, resultdata: MutPtr<MutPtr<LdapBerval>>, freeit: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), resultoid.rawAddress.toCPointer<ByteVar>(), resultdata.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapParsePageControl(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParsePageControl(externalhandle.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), totalcount.rawAddress.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParsePageControlA(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), totalcount.rawAddress.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParsePageControlW(externalhandle: MutPtr<Ldap>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, totalcount: MutPtr<UInt>, cookie: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), totalcount.rawAddress.toCPointer<ByteVar>(), cookie.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseReference(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseReference(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseReferenceA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pstr>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseReferenceW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, referrals: MutPtr<MutPtr<Pwstr>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseResult(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<Pstr>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseResult(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), returncode.rawAddress.toCPointer<ByteVar>(), matcheddns.rawAddress.toCPointer<ByteVar>(), errormessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseResultA(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pstr>, errormessage: MutPtr<Pstr>, referrals: MutPtr<MutPtr<MutPtr<Byte>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlA>>>, freeit: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseResultA(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), returncode.rawAddress.toCPointer<ByteVar>(), matcheddns.rawAddress.toCPointer<ByteVar>(), errormessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseResultW(connection: MutPtr<Ldap>, resultmessage: MutPtr<LDAPMessage>, returncode: MutPtr<UInt>, matcheddns: MutPtr<Pwstr>, errormessage: MutPtr<Pwstr>, referrals: MutPtr<MutPtr<MutPtr<UShort>>>, servercontrols: MutPtr<MutPtr<MutPtr<LDAPControlW>>>, freeit: Boolean): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseResultW(connection.rawAddress.toCPointer<ByteVar>(), resultmessage.rawAddress.toCPointer<ByteVar>(), returncode.rawAddress.toCPointer<ByteVar>(), matcheddns.rawAddress.toCPointer<ByteVar>(), errormessage.rawAddress.toCPointer<ByteVar>(), referrals.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapParseSortControl(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseSortControl(externalhandle.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>(), attribute.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseSortControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, result: MutPtr<UInt>, attribute: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>(), attribute.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseSortControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, result: MutPtr<UInt>, attribute: MutPtr<Pwstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>(), attribute.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseVlvControlA(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlA>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(externalhandle.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), targetpos.rawAddress.toCPointer<ByteVar>(), listcount.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), errcode.rawAddress.toCPointer<ByteVar>())

public actual fun ldapParseVlvControlW(externalhandle: MutPtr<Ldap>, control: MutPtr<MutPtr<LDAPControlW>>, targetpos: MutPtr<UInt>, listcount: MutPtr<UInt>, context: MutPtr<MutPtr<LdapBerval>>, errcode: MutPtr<Int>): Int =
    windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(externalhandle.rawAddress.toCPointer<ByteVar>(), control.rawAddress.toCPointer<ByteVar>(), targetpos.rawAddress.toCPointer<ByteVar>(), listcount.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), errcode.rawAddress.toCPointer<ByteVar>())

public actual fun ldapPerror(ld: MutPtr<Ldap>, msg: Pcstr) {
    windowssysWindowsWin32NetworkingLdapLdapPerror(ld.rawAddress.toCPointer<ByteVar>(), msg.rawAddress.toCPointer<ByteVar>())
}

public actual fun ldapRenameExt(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExt(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapRenameExtA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExtA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapRenameExtW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExtW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapRenameExtS(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExtS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapRenameExtSA(ld: MutPtr<Ldap>, dn: Pcstr, newrdn: Pcstr, newparent: Pcstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapRenameExtSW(ld: MutPtr<Ldap>, dn: Pcwstr, newrdn: Pcwstr, newparent: Pcwstr, deleteoldrdn: Int, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), newrdn.rawAddress.toCPointer<ByteVar>(), newparent.rawAddress.toCPointer<ByteVar>(), deleteoldrdn, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapResult(ld: MutPtr<Ldap>, msgid: UInt, all: UInt, timeout: ConstPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapResult(ld.rawAddress.toCPointer<ByteVar>(), msgid, all, timeout.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapResult2error(ld: MutPtr<Ldap>, res: MutPtr<LDAPMessage>, freeit: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapResult2error(ld.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>(), freeit)

public actual fun ldapSaslBindA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, messagenumber: MutPtr<Int>): Int =
    windowssysWindowsWin32NetworkingLdapLdapSaslBindA(externalhandle.rawAddress.toCPointer<ByteVar>(), distname.rawAddress.toCPointer<ByteVar>(), authmechanism.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), serverctrls.rawAddress.toCPointer<ByteVar>(), clientctrls.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSaslBindW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, messagenumber: MutPtr<Int>): Int =
    windowssysWindowsWin32NetworkingLdapLdapSaslBindW(externalhandle.rawAddress.toCPointer<ByteVar>(), distname.rawAddress.toCPointer<ByteVar>(), authmechanism.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), serverctrls.rawAddress.toCPointer<ByteVar>(), clientctrls.rawAddress.toCPointer<ByteVar>(), messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSaslBindSA(externalhandle: MutPtr<Ldap>, distname: Pcstr, authmechanism: Pcstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlA>>, clientctrls: MutPtr<MutPtr<LDAPControlA>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(externalhandle.rawAddress.toCPointer<ByteVar>(), distname.rawAddress.toCPointer<ByteVar>(), authmechanism.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), serverctrls.rawAddress.toCPointer<ByteVar>(), clientctrls.rawAddress.toCPointer<ByteVar>(), serverdata.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSaslBindSW(externalhandle: MutPtr<Ldap>, distname: Pcwstr, authmechanism: Pcwstr, cred: ConstPtr<LdapBerval>, serverctrls: MutPtr<MutPtr<LDAPControlW>>, clientctrls: MutPtr<MutPtr<LDAPControlW>>, serverdata: MutPtr<MutPtr<LdapBerval>>): Int =
    windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(externalhandle.rawAddress.toCPointer<ByteVar>(), distname.rawAddress.toCPointer<ByteVar>(), authmechanism.rawAddress.toCPointer<ByteVar>(), cred.rawAddress.toCPointer<ByteVar>(), serverctrls.rawAddress.toCPointer<ByteVar>(), clientctrls.rawAddress.toCPointer<ByteVar>(), serverdata.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearch(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearch(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchA(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchW(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly)

public actual fun ldapSearchAbandonPage(externalhandle: MutPtr<Ldap>, searchblock: PLDAPSearch): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(externalhandle.rawAddress.toCPointer<ByteVar>(), searchblock)

public actual fun ldapSearchExt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExt(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchExtA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExtA(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchExtW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timelimit: UInt, sizelimit: UInt, messagenumber: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExtW(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timelimit, sizelimit, messagenumber.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchExtS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExtS(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sizelimit, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchExtSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlA>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlA>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sizelimit, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchExtSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, servercontrols: ConstPtr<ConstPtr<LDAPControlW>>, clientcontrols: ConstPtr<ConstPtr<LDAPControlW>>, timeout: MutPtr<LdapTimeval>, sizelimit: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>(), sizelimit, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchInitPage(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: MutPtr<MutPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), scopeofsearch, searchfilter.rawAddress.toCPointer<ByteVar>(), attributelist.rawAddress.toCPointer<ByteVar>(), attributesonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchInitPageA(externalhandle: MutPtr<Ldap>, distinguishedname: Pcstr, scopeofsearch: UInt, searchfilter: Pcstr, attributelist: ConstPtr<ConstPtr<Byte>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyA>>): PLDAPSearch =
    windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), scopeofsearch, searchfilter.rawAddress.toCPointer<ByteVar>(), attributelist.rawAddress.toCPointer<ByteVar>(), attributesonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchInitPageW(externalhandle: MutPtr<Ldap>, distinguishedname: Pcwstr, scopeofsearch: UInt, searchfilter: Pcwstr, attributelist: ConstPtr<ConstPtr<UShort>>, attributesonly: UInt, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>, pagetimelimit: UInt, totalsizelimit: UInt, sortkeys: MutPtr<MutPtr<LDAPSortKeyW>>): PLDAPSearch =
    windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(externalhandle.rawAddress.toCPointer<ByteVar>(), distinguishedname.rawAddress.toCPointer<ByteVar>(), scopeofsearch, searchfilter.rawAddress.toCPointer<ByteVar>(), attributelist.rawAddress.toCPointer<ByteVar>(), attributesonly, servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>(), pagetimelimit, totalsizelimit, sortkeys.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchS(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchS(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchSA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchSA(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchSW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchSW(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchSt(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchSt(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, timeout.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchStA(ld: MutPtr<Ldap>, base: Pcstr, scope: UInt, filter: Pcstr, attrs: ConstPtr<ConstPtr<Byte>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchStA(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, timeout.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSearchStW(ld: MutPtr<Ldap>, base: Pcwstr, scope: UInt, filter: Pcwstr, attrs: ConstPtr<ConstPtr<UShort>>, attrsonly: UInt, timeout: MutPtr<LdapTimeval>, res: MutPtr<MutPtr<LDAPMessage>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSearchStW(ld.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>(), scope, filter.rawAddress.toCPointer<ByteVar>(), attrs.rawAddress.toCPointer<ByteVar>(), attrsonly, timeout.rawAddress.toCPointer<ByteVar>(), res.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSetDbgFlags(newflags: UInt): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(newflags)

public actual fun ldapSetDbgRoutine(debugprintroutine: Dbgprint) {
    windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(0L.toCPointer<ByteVar>())
}

public actual fun ldapSetOption(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSetOption(ld.rawAddress.toCPointer<ByteVar>(), option, invalue.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSetOptionW(ld: MutPtr<Ldap>, option: Int, invalue: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSetOptionW(ld.rawAddress.toCPointer<ByteVar>(), option, invalue.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBind(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBind(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBindA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBindW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBindS(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBindSA(ld: MutPtr<Ldap>, dn: Pcstr, passwd: Pcstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSimpleBindSW(ld: MutPtr<Ldap>, dn: Pcwstr, passwd: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(ld.rawAddress.toCPointer<ByteVar>(), dn.rawAddress.toCPointer<ByteVar>(), passwd.rawAddress.toCPointer<ByteVar>())

public actual fun ldapSslinit(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapSslinit(hostname.rawAddress.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L)

public actual fun ldapSslinitA(hostname: Pcstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapSslinitA(hostname.rawAddress.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L)

public actual fun ldapSslinitW(hostname: Pcwstr, portnumber: UInt, secure: Int): MutPtr<Ldap> =
    MutPtr(windowssysWindowsWin32NetworkingLdapLdapSslinitW(hostname.rawAddress.toCPointer<ByteVar>(), portnumber, secure)?.toLong() ?: 0L)

public actual fun ldapStartTlsSA(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlA>>, clientcontrols: MutPtr<MutPtr<LDAPControlA>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(externalhandle.rawAddress.toCPointer<ByteVar>(), serverreturnvalue.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapStartTlsSW(externalhandle: MutPtr<Ldap>, serverreturnvalue: MutPtr<UInt>, result: MutPtr<MutPtr<LDAPMessage>>, servercontrols: MutPtr<MutPtr<LDAPControlW>>, clientcontrols: MutPtr<MutPtr<LDAPControlW>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(externalhandle.rawAddress.toCPointer<ByteVar>(), serverreturnvalue.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>(), servercontrols.rawAddress.toCPointer<ByteVar>(), clientcontrols.rawAddress.toCPointer<ByteVar>())

public actual fun ldapStartup(version: MutPtr<LdapVersionInfo>, instance: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapStartup(version.rawAddress.toCPointer<ByteVar>(), instance.rawAddress.toCPointer<ByteVar>())

public actual fun ldapStopTlsS(externalhandle: MutPtr<Ldap>): Boolean =
    windowssysWindowsWin32NetworkingLdapLdapStopTlsS(externalhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ldapUfn2dn(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapUfn2dn(ufn.rawAddress.toCPointer<ByteVar>(), pdn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapUfn2dnA(ufn: Pcstr, pdn: MutPtr<Pstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(ufn.rawAddress.toCPointer<ByteVar>(), pdn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapUfn2dnW(ufn: Pcwstr, pdn: MutPtr<Pwstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(ufn.rawAddress.toCPointer<ByteVar>(), pdn.rawAddress.toCPointer<ByteVar>())

public actual fun ldapUnbind(ld: MutPtr<Ldap>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapUnbind(ld.rawAddress.toCPointer<ByteVar>())

public actual fun ldapUnbindS(ld: MutPtr<Ldap>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapUnbindS(ld.rawAddress.toCPointer<ByteVar>())

public actual fun ldapValueFree(vals: ConstPtr<Pcstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapValueFree(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapValueFreeA(vals: ConstPtr<Pcstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapValueFreeA(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapValueFreeW(vals: ConstPtr<Pcwstr>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapValueFreeW(vals.rawAddress.toCPointer<ByteVar>())

public actual fun ldapValueFreeLen(vals: MutPtr<MutPtr<LdapBerval>>): UInt =
    windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(vals.rawAddress.toCPointer<ByteVar>())
