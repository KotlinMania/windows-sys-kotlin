@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCheckColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCheckRGBs
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMCreateTransformW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMDeleteTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMGetInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMIsProfileValid
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMTranslateColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMTranslateRGB
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_checkBitmapBits
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_checkColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_checkColorsInGamut
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_closeColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_colorCorrectPalette
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_colorMatchToTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_convertIndexToColorName
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createColorTransformA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createColorTransformW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_deleteColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_deleteColorTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_enumColorProfilesA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_enumColorProfilesW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_enumICMProfilesA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_enumICMProfilesW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getCMMInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorProfileElement
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorProfileHeader
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getICMProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getICMProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_installColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_installColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_isColorProfileValid
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_openColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_openColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_registerCMMA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_registerCMMW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_selectCMM
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setColorProfileElement
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setColorProfileHeader
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setICMMode
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setICMProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setICMProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setupColorMatchingA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_setupColorMatchingW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_translateBitmapBits
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_translateColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_unregisterCMMA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_unregisterCMMW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsCheckColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssys_windows_win32_ui_colorsystem_wcsTranslateColors
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceA(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_associateColorProfileWithDeviceW(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lparesult: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCheckColors(hcmtransform, lpainputcolors?.value?.toCPointer<ByteVar>(), ncolors, ctinput, lparesult?.value?.toCPointer<ByteVar>())

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: COpaquePointer?, lparesult: COpaquePointer?, ncount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCheckColorsInGamut(hcmtransform, lpargbtriple?.value?.toCPointer<ByteVar>(), lparesult?.value?.toCPointer<ByteVar>(), ncount)

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: COpaquePointer?, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCheckRGBs(hcmtransform, lpsrcbits?.value?.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lparesult?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_cMConvertColorNameToIndex(hprofile, pacolorname?.value?.toCPointer<ByteVar>(), paindex?.value?.toCPointer<ByteVar>(), dwcount)

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_cMConvertIndexToColorName(hprofile, paindex?.value?.toCPointer<ByteVar>(), pacolorname?.value?.toCPointer<ByteVar>(), dwcount)

public actual fun cMCreateDeviceLinkProfile(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt, lpprofiledata: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCreateDeviceLinkProfile(pahprofiles?.value?.toCPointer<ByteVar>(), nprofiles, padwintents?.value?.toCPointer<ByteVar>(), nintents, dwflags, lpprofiledata?.value?.toCPointer<ByteVar>())

public actual fun cMCreateMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintents: COpaquePointer?, nintents: UInt, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_cMCreateMultiProfileTransform(pahprofiles?.value?.toCPointer<ByteVar>(), nprofiles, padwintents?.value?.toCPointer<ByteVar>(), nintents, dwflags)

public actual fun cMCreateProfile(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCreateProfile(lpcolorspace?.value?.toCPointer<ByteVar>(), lpprofiledata?.value?.toCPointer<ByteVar>())

public actual fun cMCreateProfileW(lpcolorspace: COpaquePointer?, lpprofiledata: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMCreateProfileW(lpcolorspace?.value?.toCPointer<ByteVar>(), lpprofiledata?.value?.toCPointer<ByteVar>())

public actual fun cMCreateTransform(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    windowssys_windows_win32_ui_colorsystem_cMCreateTransform(lpcolorspace?.value?.toCPointer<ByteVar>(), lpdevcharacter?.value?.toCPointer<ByteVar>(), lptargetdevcharacter?.value?.toCPointer<ByteVar>())

public actual fun cMCreateTransformExt(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_cMCreateTransformExt(lpcolorspace?.value?.toCPointer<ByteVar>(), lpdevcharacter?.value?.toCPointer<ByteVar>(), lptargetdevcharacter?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cMCreateTransformExtW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_cMCreateTransformExtW(lpcolorspace?.value?.toCPointer<ByteVar>(), lpdevcharacter?.value?.toCPointer<ByteVar>(), lptargetdevcharacter?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cMCreateTransformW(lpcolorspace: COpaquePointer?, lpdevcharacter: COpaquePointer?, lptargetdevcharacter: COpaquePointer?): Long =
    windowssys_windows_win32_ui_colorsystem_cMCreateTransformW(lpcolorspace?.value?.toCPointer<ByteVar>(), lpdevcharacter?.value?.toCPointer<ByteVar>(), lptargetdevcharacter?.value?.toCPointer<ByteVar>())

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    windowssys_windows_win32_ui_colorsystem_cMDeleteTransform(hcmtransform)

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    windowssys_windows_win32_ui_colorsystem_cMGetInfo(dwinfo)

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMGetNamedProfileInfo(hprofile, pnamedprofileinfo?.value?.toCPointer<ByteVar>())

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_cMIsProfileValid(hprofile, lpbvalid?.value?.toCPointer<ByteVar>())

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    windowssys_windows_win32_ui_colorsystem_cMTranslateColors(hcmtransform, lpainputcolors?.value?.toCPointer<ByteVar>(), ncolors, ctinput, lpaoutputcolors?.value?.toCPointer<ByteVar>(), ctoutput)

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: COpaquePointer?, dwflags: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_cMTranslateRGB(hcmtransform, colorref, lpcolorref?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_cMTranslateRGBs(hcmtransform, lpsrcbits?.value?.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lpdestbits?.value?.toCPointer<ByteVar>(), bmoutput, dwtranslatedirection)

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssys_windows_win32_ui_colorsystem_cMTranslateRGBsExt(hcmtransform, lpsrcbits?.value?.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, lpdestbits?.value?.toCPointer<ByteVar>(), bmoutput, dwoutputstride, 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: COpaquePointer?, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    windowssys_windows_win32_ui_colorsystem_checkBitmapBits(hcolortransform, psrcbits?.value?.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, paresult?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcallbackdata)

public actual fun checkColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paresult: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_checkColors(hcolortransform, painputcolors?.value?.toCPointer<ByteVar>(), ncolors, ctinput, paresult?.value?.toCPointer<ByteVar>())

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: COpaquePointer?, dlpbuffer: COpaquePointer?, ncount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_checkColorsInGamut(hdc?.value?.toCPointer<ByteVar>(), lprgbtriple?.value?.toCPointer<ByteVar>(), dlpbuffer?.value?.toCPointer<ByteVar>(), ncount)

public actual fun closeColorProfile(hprofile: Long): Bool =
    windowssys_windows_win32_ui_colorsystem_closeColorProfile(hprofile)

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_colorCorrectPalette(hdc?.value?.toCPointer<ByteVar>(), hpal?.value?.toCPointer<ByteVar>(), defirst, num)

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    windowssys_windows_win32_ui_colorsystem_colorMatchToTarget(hdc?.value?.toCPointer<ByteVar>(), hdctarget?.value?.toCPointer<ByteVar>(), action)

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: COpaquePointer?): Hresult =
    0

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: COpaquePointer?, profilecount: COpaquePointer?): Hresult =
    0

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: COpaquePointer?): Hresult =
    0

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    0

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: COpaquePointer?, paindex: COpaquePointer?, dwcount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_convertColorNameToIndex(hprofile, pacolorname?.value?.toCPointer<ByteVar>(), paindex?.value?.toCPointer<ByteVar>(), dwcount)

public actual fun convertIndexToColorName(hprofile: Long, paindex: COpaquePointer?, pacolorname: COpaquePointer?, dwcount: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_convertIndexToColorName(hprofile, paindex?.value?.toCPointer<ByteVar>(), pacolorname?.value?.toCPointer<ByteVar>(), dwcount)

public actual fun createColorSpaceA(lplcs: COpaquePointer?): Hcolorspace =
    windowssys_windows_win32_ui_colorsystem_createColorSpaceA(lplcs?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createColorSpaceW(lplcs: COpaquePointer?): Hcolorspace =
    windowssys_windows_win32_ui_colorsystem_createColorSpaceW(lplcs?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createColorTransformA(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_createColorTransformA(plogcolorspace?.value?.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun createColorTransformW(plogcolorspace: COpaquePointer?, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_createColorTransformW(plogcolorspace?.value?.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun createDeviceLinkProfile(hprofile: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, pprofiledata: COpaquePointer?, indexpreferredcmm: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_createDeviceLinkProfile(hprofile?.value?.toCPointer<ByteVar>(), nprofiles, padwintent?.value?.toCPointer<ByteVar>(), nintents, dwflags, pprofiledata?.value?.toCPointer<ByteVar>(), indexpreferredcmm)

public actual fun createMultiProfileTransform(pahprofiles: COpaquePointer?, nprofiles: UInt, padwintent: COpaquePointer?, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_createMultiProfileTransform(pahprofiles?.value?.toCPointer<ByteVar>(), nprofiles, padwintent?.value?.toCPointer<ByteVar>(), nintents, dwflags, indexpreferredcmm)

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceA(plogcolorspace?.value?.toCPointer<ByteVar>(), pprofile?.value?.toCPointer<ByteVar>())

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: COpaquePointer?, pprofile: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_createProfileFromLogColorSpaceW(plogcolorspace?.value?.toCPointer<ByteVar>(), pprofile?.value?.toCPointer<ByteVar>())

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    windowssys_windows_win32_ui_colorsystem_deleteColorSpace(hcs?.value?.toCPointer<ByteVar>())

public actual fun deleteColorTransform(hxform: Long): Bool =
    windowssys_windows_win32_ui_colorsystem_deleteColorTransform(hxform)

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceA(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_disassociateColorProfileFromDeviceW(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_enumColorProfilesA(pmachinename?.value?.toCPointer<ByteVar>(), penumrecord?.value?.toCPointer<ByteVar>(), penumerationbuffer?.value?.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer?.value?.toCPointer<ByteVar>(), pnprofiles?.value?.toCPointer<ByteVar>())

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: COpaquePointer?, penumerationbuffer: COpaquePointer?, pdwsizeofenumerationbuffer: COpaquePointer?, pnprofiles: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_enumColorProfilesW(pmachinename?.value?.toCPointer<ByteVar>(), penumrecord?.value?.toCPointer<ByteVar>(), penumerationbuffer?.value?.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer?.value?.toCPointer<ByteVar>(), pnprofiles?.value?.toCPointer<ByteVar>())

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    windowssys_windows_win32_ui_colorsystem_enumICMProfilesA(hdc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param2)

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    windowssys_windows_win32_ui_colorsystem_enumICMProfilesW(hdc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param2)

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    windowssys_windows_win32_ui_colorsystem_getCMMInfo(hcolortransform, param1)

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorDirectoryA(pmachinename?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorDirectoryW(pmachinename?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?, pbreference: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorProfileElement(hprofile, tag, dwoffset, pcbelement?.value?.toCPointer<ByteVar>(), pelement?.value?.toCPointer<ByteVar>(), pbreference?.value?.toCPointer<ByteVar>())

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorProfileElementTag(hprofile, dwindex, ptag?.value?.toCPointer<ByteVar>())

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: COpaquePointer?, pcbprofile: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorProfileFromHandle(hprofile, pprofile?.value?.toCPointer<ByteVar>(), pcbprofile?.value?.toCPointer<ByteVar>())

public actual fun getColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getColorProfileHeader(hprofile, pheader?.value?.toCPointer<ByteVar>())

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    windowssys_windows_win32_ui_colorsystem_getColorSpace(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getCountColorProfileElements(hprofile, pnelementcount?.value?.toCPointer<ByteVar>())

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getDeviceGammaRamp(hdc?.value?.toCPointer<ByteVar>(), lpramp?.value?.toCPointer<ByteVar>())

public actual fun getICMProfileA(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pstr): Bool =
    windowssys_windows_win32_ui_colorsystem_getICMProfileA(hdc?.value?.toCPointer<ByteVar>(), pbufsize?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>())

public actual fun getICMProfileW(hdc: Hdc, pbufsize: COpaquePointer?, pszfilename: Pwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_getICMProfileW(hdc?.value?.toCPointer<ByteVar>(), pbufsize?.value?.toCPointer<ByteVar>(), pszfilename?.value?.toCPointer<ByteVar>())

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_getLogColorSpaceA(hcolorspace?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: COpaquePointer?, nsize: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_getLogColorSpaceW(hcolorspace?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getNamedProfileInfo(hprofile, pnamedprofileinfo?.value?.toCPointer<ByteVar>())

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: COpaquePointer?, pcbps2colorrenderingdictionary: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingDictionary(hprofile, dwintent, pps2colorrenderingdictionary?.value?.toCPointer<ByteVar>(), pcbps2colorrenderingdictionary?.value?.toCPointer<ByteVar>(), pbbinary?.value?.toCPointer<ByteVar>())

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: COpaquePointer?, pcbps2colorrenderingintent: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getPS2ColorRenderingIntent(hprofile, dwintent, pbuffer?.value?.toCPointer<ByteVar>(), pcbps2colorrenderingintent?.value?.toCPointer<ByteVar>())

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: COpaquePointer?, pcbps2colorspacearray: COpaquePointer?, pbbinary: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getPS2ColorSpaceArray(hprofile, dwintent, dwcsatype, pps2colorspacearray?.value?.toCPointer<ByteVar>(), pcbps2colorspacearray?.value?.toCPointer<ByteVar>(), pbbinary?.value?.toCPointer<ByteVar>())

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileA(pmachinename?.value?.toCPointer<ByteVar>(), dwscs, pbuffer?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_getStandardColorSpaceProfileW(pmachinename?.value?.toCPointer<ByteVar>(), dwscs, pbuffer?.value?.toCPointer<ByteVar>(), pcbsize?.value?.toCPointer<ByteVar>())

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_installColorProfileA(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>())

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_installColorProfileW(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>())

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_isColorProfileTagPresent(hprofile, tag, pbpresent?.value?.toCPointer<ByteVar>())

public actual fun isColorProfileValid(hprofile: Long, pbvalid: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_isColorProfileValid(hprofile, pbvalid?.value?.toCPointer<ByteVar>())

public actual fun openColorProfileA(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_openColorProfileA(pprofile?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun openColorProfileW(pprofile: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_openColorProfileW(pprofile?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_registerCMMA(pmachinename?.value?.toCPointer<ByteVar>(), cmmid, pcmmdll?.value?.toCPointer<ByteVar>())

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_registerCMMW(pmachinename?.value?.toCPointer<ByteVar>(), cmmid, pcmmdll?.value?.toCPointer<ByteVar>())

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_selectCMM(dwcmmtype)

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: COpaquePointer?, pelement: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_setColorProfileElement(hprofile, tag, dwoffset, pcbelement?.value?.toCPointer<ByteVar>(), pelement?.value?.toCPointer<ByteVar>())

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_setColorProfileElementReference(hprofile, newtag, reftag)

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_setColorProfileElementSize(hprofile, tagtype, pcbelement)

public actual fun setColorProfileHeader(hprofile: Long, pheader: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_setColorProfileHeader(hprofile, pheader?.value?.toCPointer<ByteVar>())

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    windowssys_windows_win32_ui_colorsystem_setColorSpace(hdc?.value?.toCPointer<ByteVar>(), hcs?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_setDeviceGammaRamp(hdc?.value?.toCPointer<ByteVar>(), lpramp?.value?.toCPointer<ByteVar>())

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    windowssys_windows_win32_ui_colorsystem_setICMMode(hdc?.value?.toCPointer<ByteVar>(), mode)

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_setICMProfileA(hdc?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_setICMProfileW(hdc?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileA(pmachinename?.value?.toCPointer<ByteVar>(), dwprofileid, pprofilename?.value?.toCPointer<ByteVar>())

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_setStandardColorSpaceProfileW(pmachinename?.value?.toCPointer<ByteVar>(), dwprofileid, pprofilename?.value?.toCPointer<ByteVar>())

public actual fun setupColorMatchingA(pcms: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_setupColorMatchingA(pcms?.value?.toCPointer<ByteVar>())

public actual fun setupColorMatchingW(pcms: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_setupColorMatchingW(pcms?.value?.toCPointer<ByteVar>())

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: COpaquePointer?, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: COpaquePointer?, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssys_windows_win32_ui_colorsystem_translateBitmapBits(hcolortransform, psrcbits?.value?.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, pdestbits?.value?.toCPointer<ByteVar>(), bmoutput, dwoutputstride, 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun translateColors(hcolortransform: Long, painputcolors: COpaquePointer?, ncolors: UInt, ctinput: Colortype, paoutputcolors: COpaquePointer?, ctoutput: Colortype): Bool =
    windowssys_windows_win32_ui_colorsystem_translateColors(hcolortransform, painputcolors?.value?.toCPointer<ByteVar>(), ncolors, ctinput, paoutputcolors?.value?.toCPointer<ByteVar>(), ctoutput)

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    windowssys_windows_win32_ui_colorsystem_uninstallColorProfileA(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), bdelete)

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    windowssys_windows_win32_ui_colorsystem_uninstallColorProfileW(pmachinename?.value?.toCPointer<ByteVar>(), pprofilename?.value?.toCPointer<ByteVar>(), bdelete)

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_unregisterCMMA(pmachinename?.value?.toCPointer<ByteVar>(), cmmid)

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_unregisterCMMW(pmachinename?.value?.toCPointer<ByteVar>(), cmmid)

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    windowssys_windows_win32_ui_colorsystem_updateICMRegKeyA(reserved, lpszcmid?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), command)

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    windowssys_windows_win32_ui_colorsystem_updateICMRegKeyW(reserved, lpszcmid?.value?.toCPointer<ByteVar>(), lpszfilename?.value?.toCPointer<ByteVar>(), command)

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsAssociateColorProfileWithDevice(scope, pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, paresult: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsCheckColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata?.value?.toCPointer<ByteVar>(), paresult?.value?.toCPointer<ByteVar>())

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_wcsCreateIccProfile(hwcsprofile, dwoptions)

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsDisassociateColorProfileFromDevice(scope, pprofilename?.value?.toCPointer<ByteVar>(), pdevicename?.value?.toCPointer<ByteVar>())

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pbuffer: COpaquePointer?, dwsize: UInt, pnprofiles: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfiles(scope, penumrecord?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), dwsize, pnprofiles?.value?.toCPointer<ByteVar>())

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: COpaquePointer?, pdwsize: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsEnumColorProfilesSize(scope, penumrecord?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun wcsGetCalibrationManagementState(pbisenabled: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsGetCalibrationManagementState(pbisenabled?.value?.toCPointer<ByteVar>())

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfile(scope, pdevicename?.value?.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, cbprofilename, pprofilename?.value?.toCPointer<ByteVar>())

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsGetDefaultColorProfileSize(scope, pdevicename?.value?.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pcbprofilename?.value?.toCPointer<ByteVar>())

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsGetDefaultRenderingIntent(scope, pdwrenderingintent?.value?.toCPointer<ByteVar>())

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsGetUsePerUserProfiles(pdevicename?.value?.toCPointer<ByteVar>(), dwdeviceclass, puseperuserprofiles?.value?.toCPointer<ByteVar>())

public actual fun wcsOpenColorProfileA(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileA(pcdmpprofile?.value?.toCPointer<ByteVar>(), pcampprofile?.value?.toCPointer<ByteVar>(), pgmmpprofile?.value?.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun wcsOpenColorProfileW(pcdmpprofile: COpaquePointer?, pcampprofile: COpaquePointer?, pgmmpprofile: COpaquePointer?, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    windowssys_windows_win32_ui_colorsystem_wcsOpenColorProfileW(pcdmpprofile?.value?.toCPointer<ByteVar>(), pcampprofile?.value?.toCPointer<ByteVar>(), pgmmpprofile?.value?.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsSetCalibrationManagementState(bisenabled)

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsSetDefaultColorProfile(scope, pdevicename?.value?.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pprofilename?.value?.toCPointer<ByteVar>())

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsSetDefaultRenderingIntent(scope, dwrenderingintent)

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsSetUsePerUserProfiles(pdevicename?.value?.toCPointer<ByteVar>(), dwdeviceclass, useperuserprofiles)

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: COpaquePointer?, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_colorsystem_wcsTranslateColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata?.value?.toCPointer<ByteVar>(), noutputchannels, cdtoutput, cboutput, poutputdata?.value?.toCPointer<ByteVar>())
