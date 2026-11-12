@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr<SidAndAttributes>, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername.rawAddress.toCPointer<ByteVar>(), pszdisplayname.rawAddress.toCPointer<ByteVar>(), pszdescription.rawAddress.toCPointer<ByteVar>(), pcapabilities.rawAddress.toCPointer<ByteVar>(), dwcapabilitycount, ppsidappcontainersid.rawAddress.toCPointer<ByteVar>())

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername.rawAddress.toCPointer<ByteVar>())

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername.rawAddress.toCPointer<ByteVar>(), ppsidappcontainersid.rawAddress.toCPointer<ByteVar>())

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr<Psid>): Hresult =
    windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.rawAddress.toCPointer<ByteVar>(), pszrestrictedappcontainername.rawAddress.toCPointer<ByteVar>(), ppsidrestrictedappcontainersid.rawAddress.toCPointer<ByteVar>())

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid.rawAddress.toCPointer<ByteVar>(), ppszpath.rawAddress.toCPointer<ByteVar>())

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token.rawAddress.toCPointer<ByteVar>(), appcontainersid.rawAddress.toCPointer<ByteVar>(), objectpathlength, objectpath.rawAddress.toCPointer<ByteVar>(), returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr<Hkey>): Hresult =
    windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess, phappcontainerkey.rawAddress.toCPointer<ByteVar>())

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.rawAddress.toCPointer<ByteVar>())

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer.rawAddress.toCPointer<ByteVar>())

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.rawAddress.toCPointer<ByteVar>())

public actual fun isProcessInWDAGContainer(reserved: ConstPtr<CVoid>, isprocessinwdagcontainer: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved.rawAddress.toCPointer<ByteVar>(), isprocessinwdagcontainer.rawAddress.toCPointer<ByteVar>())
