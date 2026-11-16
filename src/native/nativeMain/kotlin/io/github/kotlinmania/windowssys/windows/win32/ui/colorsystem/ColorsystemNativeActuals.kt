@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCheckColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCheckRGBs
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateTransformExt
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateTransformExtW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMCreateTransformW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMDeleteTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMGetInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMIsProfileValid
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMTranslateColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMTranslateRGB
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMTranslateRGBs
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCheckBitmapBits
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCheckColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCheckColorsInGamut
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCloseColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemColorCorrectPalette
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemColorMatchToTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemConvertColorNameToIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemConvertIndexToColorName
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateColorTransformA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateColorTransformW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemDeleteColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemDeleteColorTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemEnumColorProfilesA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemEnumColorProfilesW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemEnumICMProfilesA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemEnumICMProfilesW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetCMMInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorDirectoryA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorProfileElement
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorProfileElementTag
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorProfileHeader
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetCountColorProfileElements
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetICMProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetICMProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetLogColorSpaceA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetLogColorSpaceW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetNamedProfileInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemInstallColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemInstallColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemIsColorProfileValid
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemOpenColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemOpenColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemRegisterCMMA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemRegisterCMMW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSelectCMM
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetColorProfileElement
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetColorProfileElementReference
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetColorProfileElementSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetColorProfileHeader
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetColorSpace
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetICMMode
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetICMProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetICMProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetupColorMatchingA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemSetupColorMatchingW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemTranslateBitmapBits
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemTranslateColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUninstallColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUninstallColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUnregisterCMMA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUnregisterCMMW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsCheckColors
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsCreateIccProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles
import io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem.cinterop.windowssysWindowsWin32UiColorsystemWcsTranslateColors
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun associateColorProfileWithDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceA(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun associateColorProfileWithDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemAssociateColorProfileWithDeviceW(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun cMCheckColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lparesult: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMCheckColors(hcmtransform, lpainputcolors.rawAddress.toCPointer<ByteVar>(), ncolors, ctinput, lparesult.rawAddress.toCPointer<ByteVar>())

public actual fun cMCheckColorsInGamut(hcmtransform: Long, lpargbtriple: ConstPtr, lparesult: MutPtr, ncount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCMCheckColorsInGamut(hcmtransform, lpargbtriple.rawAddress.toCPointer<ByteVar>(), lparesult.rawAddress.toCPointer<ByteVar>(), ncount)

public actual fun cMCheckRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lparesult: MutPtr, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssysWindowsWin32UiColorsystemCMCheckRGBs(hcmtransform, lpsrcbits.rawAddress.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lparesult.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun cMConvertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCMConvertColorNameToIndex(hprofile, pacolorname.rawAddress.toCPointer<ByteVar>(), paindex.rawAddress.toCPointer<ByteVar>(), dwcount)

public actual fun cMConvertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCMConvertIndexToColorName(hprofile, paindex.rawAddress.toCPointer<ByteVar>(), pacolorname.rawAddress.toCPointer<ByteVar>(), dwcount)

public actual fun cMCreateDeviceLinkProfile(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt, lpprofiledata: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMCreateDeviceLinkProfile(pahprofiles.rawAddress.toCPointer<ByteVar>(), nprofiles, padwintents.rawAddress.toCPointer<ByteVar>(), nintents, dwflags, lpprofiledata.rawAddress.toCPointer<ByteVar>())

public actual fun cMCreateMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintents: ConstPtr, nintents: UInt, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemCMCreateMultiProfileTransform(pahprofiles.rawAddress.toCPointer<ByteVar>(), nprofiles, padwintents.rawAddress.toCPointer<ByteVar>(), nintents, dwflags)

public actual fun cMCreateProfile(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMCreateProfile(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpprofiledata.rawAddress.toCPointer<ByteVar>())

public actual fun cMCreateProfileW(lpcolorspace: MutPtr, lpprofiledata: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMCreateProfileW(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpprofiledata.rawAddress.toCPointer<ByteVar>())

public actual fun cMCreateTransform(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    windowssysWindowsWin32UiColorsystemCMCreateTransform(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpdevcharacter.rawAddress.toCPointer<ByteVar>(), lptargetdevcharacter.rawAddress.toCPointer<ByteVar>())

public actual fun cMCreateTransformExt(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemCMCreateTransformExt(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpdevcharacter.rawAddress.toCPointer<ByteVar>(), lptargetdevcharacter.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cMCreateTransformExtW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemCMCreateTransformExtW(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpdevcharacter.rawAddress.toCPointer<ByteVar>(), lptargetdevcharacter.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cMCreateTransformW(lpcolorspace: ConstPtr, lpdevcharacter: ConstPtr, lptargetdevcharacter: ConstPtr): Long =
    windowssysWindowsWin32UiColorsystemCMCreateTransformW(lpcolorspace.rawAddress.toCPointer<ByteVar>(), lpdevcharacter.rawAddress.toCPointer<ByteVar>(), lptargetdevcharacter.rawAddress.toCPointer<ByteVar>())

public actual fun cMDeleteTransform(hcmtransform: Long): Bool =
    windowssysWindowsWin32UiColorsystemCMDeleteTransform(hcmtransform)

public actual fun cMGetInfo(dwinfo: UInt): UInt =
    windowssysWindowsWin32UiColorsystemCMGetInfo(dwinfo)

public actual fun cMGetNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMGetNamedProfileInfo(hprofile, pnamedprofileinfo.rawAddress.toCPointer<ByteVar>())

public actual fun cMIsProfileValid(hprofile: Long, lpbvalid: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCMIsProfileValid(hprofile, lpbvalid.rawAddress.toCPointer<ByteVar>())

public actual fun cMTranslateColors(hcmtransform: Long, lpainputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, lpaoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    windowssysWindowsWin32UiColorsystemCMTranslateColors(hcmtransform, lpainputcolors.rawAddress.toCPointer<ByteVar>(), ncolors, ctinput, lpaoutputcolors.rawAddress.toCPointer<ByteVar>(), ctoutput)

public actual fun cMTranslateRGB(hcmtransform: Long, colorref: Colorref, lpcolorref: MutPtr, dwflags: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCMTranslateRGB(hcmtransform, colorref, lpcolorref.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun cMTranslateRGBs(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwtranslatedirection: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCMTranslateRGBs(hcmtransform, lpsrcbits.rawAddress.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, lpdestbits.rawAddress.toCPointer<ByteVar>(), bmoutput, dwtranslatedirection)

public actual fun cMTranslateRGBsExt(hcmtransform: Long, lpsrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, lpdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, lpfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssysWindowsWin32UiColorsystemCMTranslateRGBsExt(hcmtransform, lpsrcbits.rawAddress.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, lpdestbits.rawAddress.toCPointer<ByteVar>(), bmoutput, dwoutputstride, 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun checkBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwstride: UInt, paresult: MutPtr, pfncallback: Lpbmcallbackfn, lpcallbackdata: Lparam): Bool =
    windowssysWindowsWin32UiColorsystemCheckBitmapBits(hcolortransform, psrcbits.rawAddress.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwstride, paresult.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpcallbackdata)

public actual fun checkColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paresult: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCheckColors(hcolortransform, painputcolors.rawAddress.toCPointer<ByteVar>(), ncolors, ctinput, paresult.rawAddress.toCPointer<ByteVar>())

public actual fun checkColorsInGamut(hdc: Hdc, lprgbtriple: ConstPtr, dlpbuffer: MutPtr, ncount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCheckColorsInGamut(hdc.rawAddress.toCPointer<ByteVar>(), lprgbtriple.rawAddress.toCPointer<ByteVar>(), dlpbuffer.rawAddress.toCPointer<ByteVar>(), ncount)

public actual fun closeColorProfile(hprofile: Long): Bool =
    windowssysWindowsWin32UiColorsystemCloseColorProfile(hprofile)

public actual fun colorCorrectPalette(hdc: Hdc, hpal: Hpalette, defirst: UInt, num: UInt): Bool =
    windowssysWindowsWin32UiColorsystemColorCorrectPalette(hdc.rawAddress.toCPointer<ByteVar>(), hpal.rawAddress.toCPointer<ByteVar>(), defirst, num)

public actual fun colorMatchToTarget(hdc: Hdc, hdctarget: Hdc, action: ColorMatchToTargetAction): Bool =
    windowssysWindowsWin32UiColorsystemColorMatchToTarget(hdc.rawAddress.toCPointer<ByteVar>(), hdctarget.rawAddress.toCPointer<ByteVar>(), action)

public actual fun colorProfileAddDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, setasdefault: Bool, associateasadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileGetDisplayDefault(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, profilename: MutPtr): Hresult =
    0

public actual fun colorProfileGetDisplayList(scope: WcsProfileManagementScope, targetadapterid: Luid, sourceid: UInt, profilelist: MutPtr, profilecount: MutPtr): Hresult =
    0

public actual fun colorProfileGetDisplayUserScope(targetadapterid: Luid, sourceid: UInt, scope: MutPtr): Hresult =
    0

public actual fun colorProfileRemoveDisplayAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, targetadapterid: Luid, sourceid: UInt, dissociateadvancedcolor: Bool): Hresult =
    0

public actual fun colorProfileSetDisplayDefaultAssociation(scope: WcsProfileManagementScope, profilename: Pcwstr, profiletype: Colorprofiletype, profilesubtype: Colorprofilesubtype, targetadapterid: Luid, sourceid: UInt): Hresult =
    0

public actual fun convertColorNameToIndex(hprofile: Long, pacolorname: ConstPtr, paindex: MutPtr, dwcount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemConvertColorNameToIndex(hprofile, pacolorname.rawAddress.toCPointer<ByteVar>(), paindex.rawAddress.toCPointer<ByteVar>(), dwcount)

public actual fun convertIndexToColorName(hprofile: Long, paindex: ConstPtr, pacolorname: MutPtr, dwcount: UInt): Bool =
    windowssysWindowsWin32UiColorsystemConvertIndexToColorName(hprofile, paindex.rawAddress.toCPointer<ByteVar>(), pacolorname.rawAddress.toCPointer<ByteVar>(), dwcount)

public actual fun createColorSpaceA(lplcs: ConstPtr): Hcolorspace =
    MutPtr(windowssysWindowsWin32UiColorsystemCreateColorSpaceA(lplcs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createColorSpaceW(lplcs: ConstPtr): Hcolorspace =
    MutPtr(windowssysWindowsWin32UiColorsystemCreateColorSpaceW(lplcs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createColorTransformA(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemCreateColorTransformA(plogcolorspace.rawAddress.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun createColorTransformW(plogcolorspace: ConstPtr, hdestprofile: Long, htargetprofile: Long, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemCreateColorTransformW(plogcolorspace.rawAddress.toCPointer<ByteVar>(), hdestprofile, htargetprofile, dwflags)

public actual fun createDeviceLinkProfile(hprofile: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, pprofiledata: MutPtr, indexpreferredcmm: UInt): Bool =
    windowssysWindowsWin32UiColorsystemCreateDeviceLinkProfile(hprofile.rawAddress.toCPointer<ByteVar>(), nprofiles, padwintent.rawAddress.toCPointer<ByteVar>(), nintents, dwflags, pprofiledata.rawAddress.toCPointer<ByteVar>(), indexpreferredcmm)

public actual fun createMultiProfileTransform(pahprofiles: ConstPtr, nprofiles: UInt, padwintent: ConstPtr, nintents: UInt, dwflags: UInt, indexpreferredcmm: UInt): Long =
    windowssysWindowsWin32UiColorsystemCreateMultiProfileTransform(pahprofiles.rawAddress.toCPointer<ByteVar>(), nprofiles, padwintent.rawAddress.toCPointer<ByteVar>(), nintents, dwflags, indexpreferredcmm)

public actual fun createProfileFromLogColorSpaceA(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceA(plogcolorspace.rawAddress.toCPointer<ByteVar>(), pprofile.rawAddress.toCPointer<ByteVar>())

public actual fun createProfileFromLogColorSpaceW(plogcolorspace: ConstPtr, pprofile: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemCreateProfileFromLogColorSpaceW(plogcolorspace.rawAddress.toCPointer<ByteVar>(), pprofile.rawAddress.toCPointer<ByteVar>())

public actual fun deleteColorSpace(hcs: Hcolorspace): Bool =
    windowssysWindowsWin32UiColorsystemDeleteColorSpace(hcs.rawAddress.toCPointer<ByteVar>())

public actual fun deleteColorTransform(hxform: Long): Bool =
    windowssysWindowsWin32UiColorsystemDeleteColorTransform(hxform)

public actual fun disassociateColorProfileFromDeviceA(pmachinename: Pcstr, pprofilename: Pcstr, pdevicename: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceA(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun disassociateColorProfileFromDeviceW(pmachinename: Pcwstr, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemDisassociateColorProfileFromDeviceW(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun enumColorProfilesA(pmachinename: Pcstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemEnumColorProfilesA(pmachinename.rawAddress.toCPointer<ByteVar>(), penumrecord.rawAddress.toCPointer<ByteVar>(), penumerationbuffer.rawAddress.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer.rawAddress.toCPointer<ByteVar>(), pnprofiles.rawAddress.toCPointer<ByteVar>())

public actual fun enumColorProfilesW(pmachinename: Pcwstr, penumrecord: ConstPtr, penumerationbuffer: MutPtr, pdwsizeofenumerationbuffer: MutPtr, pnprofiles: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemEnumColorProfilesW(pmachinename.rawAddress.toCPointer<ByteVar>(), penumrecord.rawAddress.toCPointer<ByteVar>(), penumerationbuffer.rawAddress.toCPointer<ByteVar>(), pdwsizeofenumerationbuffer.rawAddress.toCPointer<ByteVar>(), pnprofiles.rawAddress.toCPointer<ByteVar>())

public actual fun enumICMProfilesA(hdc: Hdc, proc: Icmenumproca, param2: Lparam): Int =
    windowssysWindowsWin32UiColorsystemEnumICMProfilesA(hdc.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param2)

public actual fun enumICMProfilesW(hdc: Hdc, proc: Icmenumprocw, param2: Lparam): Int =
    windowssysWindowsWin32UiColorsystemEnumICMProfilesW(hdc.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param2)

public actual fun getCMMInfo(hcolortransform: Long, param1: UInt): UInt =
    windowssysWindowsWin32UiColorsystemGetCMMInfo(hcolortransform, param1)

public actual fun getColorDirectoryA(pmachinename: Pcstr, pbuffer: Pstr, pdwsize: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorDirectoryA(pmachinename.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun getColorDirectoryW(pmachinename: Pcwstr, pbuffer: Pwstr, pdwsize: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorDirectoryW(pmachinename.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun getColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: MutPtr, pelement: MutPtr, pbreference: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorProfileElement(hprofile, tag, dwoffset, pcbelement.rawAddress.toCPointer<ByteVar>(), pelement.rawAddress.toCPointer<ByteVar>(), pbreference.rawAddress.toCPointer<ByteVar>())

public actual fun getColorProfileElementTag(hprofile: Long, dwindex: UInt, ptag: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorProfileElementTag(hprofile, dwindex, ptag.rawAddress.toCPointer<ByteVar>())

public actual fun getColorProfileFromHandle(hprofile: Long, pprofile: MutPtr, pcbprofile: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorProfileFromHandle(hprofile, pprofile.rawAddress.toCPointer<ByteVar>(), pcbprofile.rawAddress.toCPointer<ByteVar>())

public actual fun getColorProfileHeader(hprofile: Long, pheader: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetColorProfileHeader(hprofile, pheader.rawAddress.toCPointer<ByteVar>())

public actual fun getColorSpace(hdc: Hdc): Hcolorspace =
    MutPtr(windowssysWindowsWin32UiColorsystemGetColorSpace(hdc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getCountColorProfileElements(hprofile: Long, pnelementcount: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetCountColorProfileElements(hprofile, pnelementcount.rawAddress.toCPointer<ByteVar>())

public actual fun getDeviceGammaRamp(hdc: Hdc, lpramp: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetDeviceGammaRamp(hdc.rawAddress.toCPointer<ByteVar>(), lpramp.rawAddress.toCPointer<ByteVar>())

public actual fun getICMProfileA(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pstr): Bool =
    windowssysWindowsWin32UiColorsystemGetICMProfileA(hdc.rawAddress.toCPointer<ByteVar>(), pbufsize.rawAddress.toCPointer<ByteVar>(), pszfilename.rawAddress.toCPointer<ByteVar>())

public actual fun getICMProfileW(hdc: Hdc, pbufsize: MutPtr, pszfilename: Pwstr): Bool =
    windowssysWindowsWin32UiColorsystemGetICMProfileW(hdc.rawAddress.toCPointer<ByteVar>(), pbufsize.rawAddress.toCPointer<ByteVar>(), pszfilename.rawAddress.toCPointer<ByteVar>())

public actual fun getLogColorSpaceA(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    windowssysWindowsWin32UiColorsystemGetLogColorSpaceA(hcolorspace.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getLogColorSpaceW(hcolorspace: Hcolorspace, lpbuffer: MutPtr, nsize: UInt): Bool =
    windowssysWindowsWin32UiColorsystemGetLogColorSpaceW(hcolorspace.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getNamedProfileInfo(hprofile: Long, pnamedprofileinfo: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetNamedProfileInfo(hprofile, pnamedprofileinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getPS2ColorRenderingDictionary(hprofile: Long, dwintent: UInt, pps2colorrenderingdictionary: MutPtr, pcbps2colorrenderingdictionary: MutPtr, pbbinary: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingDictionary(hprofile, dwintent, pps2colorrenderingdictionary.rawAddress.toCPointer<ByteVar>(), pcbps2colorrenderingdictionary.rawAddress.toCPointer<ByteVar>(), pbbinary.rawAddress.toCPointer<ByteVar>())

public actual fun getPS2ColorRenderingIntent(hprofile: Long, dwintent: UInt, pbuffer: MutPtr, pcbps2colorrenderingintent: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetPS2ColorRenderingIntent(hprofile, dwintent, pbuffer.rawAddress.toCPointer<ByteVar>(), pcbps2colorrenderingintent.rawAddress.toCPointer<ByteVar>())

public actual fun getPS2ColorSpaceArray(hprofile: Long, dwintent: UInt, dwcsatype: UInt, pps2colorspacearray: MutPtr, pcbps2colorspacearray: MutPtr, pbbinary: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetPS2ColorSpaceArray(hprofile, dwintent, dwcsatype, pps2colorspacearray.rawAddress.toCPointer<ByteVar>(), pcbps2colorspacearray.rawAddress.toCPointer<ByteVar>(), pbbinary.rawAddress.toCPointer<ByteVar>())

public actual fun getStandardColorSpaceProfileA(pmachinename: Pcstr, dwscs: UInt, pbuffer: Pstr, pcbsize: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileA(pmachinename.rawAddress.toCPointer<ByteVar>(), dwscs, pbuffer.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun getStandardColorSpaceProfileW(pmachinename: Pcwstr, dwscs: UInt, pbuffer: Pwstr, pcbsize: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemGetStandardColorSpaceProfileW(pmachinename.rawAddress.toCPointer<ByteVar>(), dwscs, pbuffer.rawAddress.toCPointer<ByteVar>(), pcbsize.rawAddress.toCPointer<ByteVar>())

public actual fun installColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemInstallColorProfileA(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun installColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemInstallColorProfileW(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun isColorProfileTagPresent(hprofile: Long, tag: UInt, pbpresent: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemIsColorProfileTagPresent(hprofile, tag, pbpresent.rawAddress.toCPointer<ByteVar>())

public actual fun isColorProfileValid(hprofile: Long, pbvalid: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemIsColorProfileValid(hprofile, pbvalid.rawAddress.toCPointer<ByteVar>())

public actual fun openColorProfileA(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    windowssysWindowsWin32UiColorsystemOpenColorProfileA(pprofile.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun openColorProfileW(pprofile: ConstPtr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt): Long =
    windowssysWindowsWin32UiColorsystemOpenColorProfileW(pprofile.rawAddress.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationmode)

public actual fun registerCMMA(pmachinename: Pcstr, cmmid: UInt, pcmmdll: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemRegisterCMMA(pmachinename.rawAddress.toCPointer<ByteVar>(), cmmid, pcmmdll.rawAddress.toCPointer<ByteVar>())

public actual fun registerCMMW(pmachinename: Pcwstr, cmmid: UInt, pcmmdll: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemRegisterCMMW(pmachinename.rawAddress.toCPointer<ByteVar>(), cmmid, pcmmdll.rawAddress.toCPointer<ByteVar>())

public actual fun selectCMM(dwcmmtype: UInt): Bool =
    windowssysWindowsWin32UiColorsystemSelectCMM(dwcmmtype)

public actual fun setColorProfileElement(hprofile: Long, tag: UInt, dwoffset: UInt, pcbelement: ConstPtr, pelement: ConstPtr): Bool =
    windowssysWindowsWin32UiColorsystemSetColorProfileElement(hprofile, tag, dwoffset, pcbelement.rawAddress.toCPointer<ByteVar>(), pelement.rawAddress.toCPointer<ByteVar>())

public actual fun setColorProfileElementReference(hprofile: Long, newtag: UInt, reftag: UInt): Bool =
    windowssysWindowsWin32UiColorsystemSetColorProfileElementReference(hprofile, newtag, reftag)

public actual fun setColorProfileElementSize(hprofile: Long, tagtype: UInt, pcbelement: UInt): Bool =
    windowssysWindowsWin32UiColorsystemSetColorProfileElementSize(hprofile, tagtype, pcbelement)

public actual fun setColorProfileHeader(hprofile: Long, pheader: ConstPtr): Bool =
    windowssysWindowsWin32UiColorsystemSetColorProfileHeader(hprofile, pheader.rawAddress.toCPointer<ByteVar>())

public actual fun setColorSpace(hdc: Hdc, hcs: Hcolorspace): Hcolorspace =
    MutPtr(windowssysWindowsWin32UiColorsystemSetColorSpace(hdc.rawAddress.toCPointer<ByteVar>(), hcs.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setDeviceGammaRamp(hdc: Hdc, lpramp: ConstPtr): Bool =
    windowssysWindowsWin32UiColorsystemSetDeviceGammaRamp(hdc.rawAddress.toCPointer<ByteVar>(), lpramp.rawAddress.toCPointer<ByteVar>())

public actual fun setICMMode(hdc: Hdc, mode: IcmMode): Int =
    windowssysWindowsWin32UiColorsystemSetICMMode(hdc.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun setICMProfileA(hdc: Hdc, lpfilename: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemSetICMProfileA(hdc.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun setICMProfileW(hdc: Hdc, lpfilename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemSetICMProfileW(hdc.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())

public actual fun setStandardColorSpaceProfileA(pmachinename: Pcstr, dwprofileid: UInt, pprofilename: Pcstr): Bool =
    windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileA(pmachinename.rawAddress.toCPointer<ByteVar>(), dwprofileid, pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun setStandardColorSpaceProfileW(pmachinename: Pcwstr, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemSetStandardColorSpaceProfileW(pmachinename.rawAddress.toCPointer<ByteVar>(), dwprofileid, pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun setupColorMatchingA(pcms: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemSetupColorMatchingA(pcms.rawAddress.toCPointer<ByteVar>())

public actual fun setupColorMatchingW(pcms: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemSetupColorMatchingW(pcms.rawAddress.toCPointer<ByteVar>())

public actual fun translateBitmapBits(hcolortransform: Long, psrcbits: ConstPtr, bminput: Bmformat, dwwidth: UInt, dwheight: UInt, dwinputstride: UInt, pdestbits: MutPtr, bmoutput: Bmformat, dwoutputstride: UInt, pfncallback: Lpbmcallbackfn, ulcallbackdata: Lparam): Bool =
    windowssysWindowsWin32UiColorsystemTranslateBitmapBits(hcolortransform, psrcbits.rawAddress.toCPointer<ByteVar>(), bminput, dwwidth, dwheight, dwinputstride, pdestbits.rawAddress.toCPointer<ByteVar>(), bmoutput, dwoutputstride, 0L.toCPointer<ByteVar>(), ulcallbackdata)

public actual fun translateColors(hcolortransform: Long, painputcolors: ConstPtr, ncolors: UInt, ctinput: Colortype, paoutputcolors: MutPtr, ctoutput: Colortype): Bool =
    windowssysWindowsWin32UiColorsystemTranslateColors(hcolortransform, painputcolors.rawAddress.toCPointer<ByteVar>(), ncolors, ctinput, paoutputcolors.rawAddress.toCPointer<ByteVar>(), ctoutput)

public actual fun uninstallColorProfileA(pmachinename: Pcstr, pprofilename: Pcstr, bdelete: Bool): Bool =
    windowssysWindowsWin32UiColorsystemUninstallColorProfileA(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), bdelete)

public actual fun uninstallColorProfileW(pmachinename: Pcwstr, pprofilename: Pcwstr, bdelete: Bool): Bool =
    windowssysWindowsWin32UiColorsystemUninstallColorProfileW(pmachinename.rawAddress.toCPointer<ByteVar>(), pprofilename.rawAddress.toCPointer<ByteVar>(), bdelete)

public actual fun unregisterCMMA(pmachinename: Pcstr, cmmid: UInt): Bool =
    windowssysWindowsWin32UiColorsystemUnregisterCMMA(pmachinename.rawAddress.toCPointer<ByteVar>(), cmmid)

public actual fun unregisterCMMW(pmachinename: Pcwstr, cmmid: UInt): Bool =
    windowssysWindowsWin32UiColorsystemUnregisterCMMW(pmachinename.rawAddress.toCPointer<ByteVar>(), cmmid)

public actual fun updateICMRegKeyA(reserved: UInt, lpszcmid: Pcstr, lpszfilename: Pcstr, command: IcmCommand): Bool =
    windowssysWindowsWin32UiColorsystemUpdateICMRegKeyA(reserved, lpszcmid.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), command)

public actual fun updateICMRegKeyW(reserved: UInt, lpszcmid: Pcwstr, lpszfilename: Pcwstr, command: IcmCommand): Bool =
    windowssysWindowsWin32UiColorsystemUpdateICMRegKeyW(reserved, lpszcmid.rawAddress.toCPointer<ByteVar>(), lpszfilename.rawAddress.toCPointer<ByteVar>(), command)

public actual fun wcsAssociateColorProfileWithDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemWcsAssociateColorProfileWithDevice(scope, pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun wcsCheckColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, paresult: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsCheckColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata.rawAddress.toCPointer<ByteVar>(), paresult.rawAddress.toCPointer<ByteVar>())

public actual fun wcsCreateIccProfile(hwcsprofile: Long, dwoptions: UInt): Long =
    windowssysWindowsWin32UiColorsystemWcsCreateIccProfile(hwcsprofile, dwoptions)

public actual fun wcsDisassociateColorProfileFromDevice(scope: WcsProfileManagementScope, pprofilename: Pcwstr, pdevicename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemWcsDisassociateColorProfileFromDevice(scope, pprofilename.rawAddress.toCPointer<ByteVar>(), pdevicename.rawAddress.toCPointer<ByteVar>())

public actual fun wcsEnumColorProfiles(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pbuffer: MutPtr, dwsize: UInt, pnprofiles: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsEnumColorProfiles(scope, penumrecord.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), dwsize, pnprofiles.rawAddress.toCPointer<ByteVar>())

public actual fun wcsEnumColorProfilesSize(scope: WcsProfileManagementScope, penumrecord: ConstPtr, pdwsize: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsEnumColorProfilesSize(scope, penumrecord.rawAddress.toCPointer<ByteVar>(), pdwsize.rawAddress.toCPointer<ByteVar>())

public actual fun wcsGetCalibrationManagementState(pbisenabled: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsGetCalibrationManagementState(pbisenabled.rawAddress.toCPointer<ByteVar>())

public actual fun wcsGetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, cbprofilename: UInt, pprofilename: Pwstr): Bool =
    windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfile(scope, pdevicename.rawAddress.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, cbprofilename, pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun wcsGetDefaultColorProfileSize(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pcbprofilename: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsGetDefaultColorProfileSize(scope, pdevicename.rawAddress.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pcbprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun wcsGetDefaultRenderingIntent(scope: WcsProfileManagementScope, pdwrenderingintent: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsGetDefaultRenderingIntent(scope, pdwrenderingintent.rawAddress.toCPointer<ByteVar>())

public actual fun wcsGetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, puseperuserprofiles: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsGetUsePerUserProfiles(pdevicename.rawAddress.toCPointer<ByteVar>(), dwdeviceclass, puseperuserprofiles.rawAddress.toCPointer<ByteVar>())

public actual fun wcsOpenColorProfileA(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemWcsOpenColorProfileA(pcdmpprofile.rawAddress.toCPointer<ByteVar>(), pcampprofile.rawAddress.toCPointer<ByteVar>(), pgmmpprofile.rawAddress.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun wcsOpenColorProfileW(pcdmpprofile: ConstPtr, pcampprofile: ConstPtr, pgmmpprofile: ConstPtr, dwdesireaccess: UInt, dwsharemode: UInt, dwcreationmode: UInt, dwflags: UInt): Long =
    windowssysWindowsWin32UiColorsystemWcsOpenColorProfileW(pcdmpprofile.rawAddress.toCPointer<ByteVar>(), pcampprofile.rawAddress.toCPointer<ByteVar>(), pgmmpprofile.rawAddress.toCPointer<ByteVar>(), dwdesireaccess, dwsharemode, dwcreationmode, dwflags)

public actual fun wcsSetCalibrationManagementState(bisenabled: Bool): Bool =
    windowssysWindowsWin32UiColorsystemWcsSetCalibrationManagementState(bisenabled)

public actual fun wcsSetDefaultColorProfile(scope: WcsProfileManagementScope, pdevicename: Pcwstr, cptcolorprofiletype: Colorprofiletype, cpstcolorprofilesubtype: Colorprofilesubtype, dwprofileid: UInt, pprofilename: Pcwstr): Bool =
    windowssysWindowsWin32UiColorsystemWcsSetDefaultColorProfile(scope, pdevicename.rawAddress.toCPointer<ByteVar>(), cptcolorprofiletype, cpstcolorprofilesubtype, dwprofileid, pprofilename.rawAddress.toCPointer<ByteVar>())

public actual fun wcsSetDefaultRenderingIntent(scope: WcsProfileManagementScope, dwrenderingintent: UInt): Bool =
    windowssysWindowsWin32UiColorsystemWcsSetDefaultRenderingIntent(scope, dwrenderingintent)

public actual fun wcsSetUsePerUserProfiles(pdevicename: Pcwstr, dwdeviceclass: UInt, useperuserprofiles: Bool): Bool =
    windowssysWindowsWin32UiColorsystemWcsSetUsePerUserProfiles(pdevicename.rawAddress.toCPointer<ByteVar>(), dwdeviceclass, useperuserprofiles)

public actual fun wcsTranslateColors(hcolortransform: Long, ncolors: UInt, ninputchannels: UInt, cdtinput: Colordatatype, cbinput: UInt, pinputdata: ConstPtr, noutputchannels: UInt, cdtoutput: Colordatatype, cboutput: UInt, poutputdata: MutPtr): Bool =
    windowssysWindowsWin32UiColorsystemWcsTranslateColors(hcolortransform, ncolors, ninputchannels, cdtinput, cbinput, pinputdata.rawAddress.toCPointer<ByteVar>(), noutputchannels, cdtoutput, cboutput, poutputdata.rawAddress.toCPointer<ByteVar>())
