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
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public expect fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr<SidAndAttributes>, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr<Psid>): Hresult

public expect fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult

public expect fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr<Psid>): Hresult

public expect fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr<Psid>): Hresult

public expect fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr<Pwstr>): Hresult

public expect fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr<UInt>): Bool

public expect fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr<Hkey>): Hresult

public expect fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr<Bool>): Hresult

public expect fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr<Bool>): Hresult

public expect fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr<Bool>): Hresult

public expect fun isProcessInWDAGContainer(reserved: ConstPtr<CVoid>, isprocessinwdagcontainer: MutPtr<Bool>): Hresult
