// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=ChoosePixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ChoosePixelFormat`(`hdc` : `super`.`Gdi`.`HDC`, `ppfd` : /* Rust *const */ kotlinx.cinterop.CPointer<`PIXELFORMATDESCRIPTOR`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=DescribePixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `DescribePixelFormat`(`hdc` : `super`.`Gdi`.`HDC`, `ipixelformat` : Int, `nbytes` : UInt, `ppfd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PIXELFORMATDESCRIPTOR`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetEnhMetaFilePixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetEnhMetaFilePixelFormat`(`hemf` : `super`.`Gdi`.`HENHMETAFILE`, `cbbuffer` : UInt, `ppfd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PIXELFORMATDESCRIPTOR`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=GetPixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GetPixelFormat`(`hdc` : `super`.`Gdi`.`HDC`) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SetPixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SetPixelFormat`(`hdc` : `super`.`Gdi`.`HDC`, `format` : Int, `ppfd` : /* Rust *const */ kotlinx.cinterop.CPointer<`PIXELFORMATDESCRIPTOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdi32.dll, ABI=system, export=SwapBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `SwapBuffers`(`param0` : `super`.`Gdi`.`HDC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glAccum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glAccum`(`op` : UInt, `value` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glAlphaFunc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glAlphaFunc`(`func` : UInt, `ref` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glAreTexturesResident; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glAreTexturesResident`(`n` : Int, `textures` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `residences` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glArrayElement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glArrayElement`(`i` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glBegin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glBegin`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glBindTexture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glBindTexture`(`target` : UInt, `texture` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glBitmap`(`width` : Int, `height` : Int, `xorig` : Float, `yorig` : Float, `xmove` : Float, `ymove` : Float, `bitmap` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glBlendFunc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glBlendFunc`(`sfactor` : UInt, `dfactor` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCallList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCallList`(`list` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCallLists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCallLists`(`n` : Int, `type` : UInt, `lists` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClear`(`mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClearAccum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClearAccum`(`red` : Float, `green` : Float, `blue` : Float, `alpha` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClearColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClearColor`(`red` : Float, `green` : Float, `blue` : Float, `alpha` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClearDepth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClearDepth`(`depth` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClearIndex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClearIndex`(`c` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClearStencil; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClearStencil`(`s` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glClipPlane; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glClipPlane`(`plane` : UInt, `equation` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3b; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3b`(`red` : Byte, `green` : Byte, `blue` : Byte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3bv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3bv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3d`(`red` : Double, `green` : Double, `blue` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3f`(`red` : Float, `green` : Float, `blue` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3i`(`red` : Int, `green` : Int, `blue` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3s`(`red` : Short, `green` : Short, `blue` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3ub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3ub`(`red` : UByte, `green` : UByte, `blue` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3ubv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3ubv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3ui; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3ui`(`red` : UInt, `green` : UInt, `blue` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3uiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3uiv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3us; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3us`(`red` : UShort, `green` : UShort, `blue` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor3usv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor3usv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4b; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4b`(`red` : Byte, `green` : Byte, `blue` : Byte, `alpha` : Byte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4bv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4bv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4d`(`red` : Double, `green` : Double, `blue` : Double, `alpha` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4f`(`red` : Float, `green` : Float, `blue` : Float, `alpha` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4i`(`red` : Int, `green` : Int, `blue` : Int, `alpha` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4s`(`red` : Short, `green` : Short, `blue` : Short, `alpha` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4ub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4ub`(`red` : UByte, `green` : UByte, `blue` : UByte, `alpha` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4ubv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4ubv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4ui; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4ui`(`red` : UInt, `green` : UInt, `blue` : UInt, `alpha` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4uiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4uiv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4us; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4us`(`red` : UShort, `green` : UShort, `blue` : UShort, `alpha` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColor4usv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColor4usv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColorMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColorMask`(`red` : UByte, `green` : UByte, `blue` : UByte, `alpha` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColorMaterial; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColorMaterial`(`face` : UInt, `mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glColorPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glColorPointer`(`size` : Int, `type` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCopyPixels; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCopyPixels`(`x` : Int, `y` : Int, `width` : Int, `height` : Int, `type` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCopyTexImage1D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCopyTexImage1D`(`target` : UInt, `level` : Int, `internalformat` : UInt, `x` : Int, `y` : Int, `width` : Int, `border` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCopyTexImage2D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCopyTexImage2D`(`target` : UInt, `level` : Int, `internalformat` : UInt, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `border` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCopyTexSubImage1D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCopyTexSubImage1D`(`target` : UInt, `level` : Int, `xoffset` : Int, `x` : Int, `y` : Int, `width` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCopyTexSubImage2D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCopyTexSubImage2D`(`target` : UInt, `level` : Int, `xoffset` : Int, `yoffset` : Int, `x` : Int, `y` : Int, `width` : Int, `height` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glCullFace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glCullFace`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDeleteLists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDeleteLists`(`list` : UInt, `range` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDeleteTextures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDeleteTextures`(`n` : Int, `textures` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDepthFunc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDepthFunc`(`func` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDepthMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDepthMask`(`flag` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDepthRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDepthRange`(`znear` : Double, `zfar` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDisable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDisable`(`cap` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDisableClientState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDisableClientState`(`array` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDrawArrays; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDrawArrays`(`mode` : UInt, `first` : Int, `count` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDrawBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDrawBuffer`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDrawElements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDrawElements`(`mode` : UInt, `count` : Int, `type` : UInt, `indices` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glDrawPixels; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glDrawPixels`(`width` : Int, `height` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEdgeFlag; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEdgeFlag`(`flag` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEdgeFlagPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEdgeFlagPointer`(`stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEdgeFlagv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEdgeFlagv`(`flag` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEnable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEnable`(`cap` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEnableClientState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEnableClientState`(`array` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEnd`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEndList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEndList`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord1d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord1d`(`u` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord1dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord1dv`(`u` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord1f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord1f`(`u` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord1fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord1fv`(`u` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord2d`(`u` : Double, `v` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord2dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord2dv`(`u` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord2f`(`u` : Float, `v` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalCoord2fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalCoord2fv`(`u` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalMesh1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalMesh1`(`mode` : UInt, `i1` : Int, `i2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalMesh2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalMesh2`(`mode` : UInt, `i1` : Int, `i2` : Int, `j1` : Int, `j2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalPoint1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalPoint1`(`i` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glEvalPoint2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glEvalPoint2`(`i` : Int, `j` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFeedbackBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFeedbackBuffer`(`size` : Int, `type` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFinish; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFinish`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFlush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFlush`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFogf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFogf`(`pname` : UInt, `param1` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFogfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFogfv`(`pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFogi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFogi`(`pname` : UInt, `param1` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFogiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFogiv`(`pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFrontFace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFrontFace`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glFrustum; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glFrustum`(`left` : Double, `right` : Double, `bottom` : Double, `top` : Double, `znear` : Double, `zfar` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGenLists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGenLists`(`range` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGenTextures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGenTextures`(`n` : Int, `textures` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetBooleanv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetBooleanv`(`pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetClipPlane; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetClipPlane`(`plane` : UInt, `equation` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetDoublev; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetDoublev`(`pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetError`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetFloatv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetFloatv`(`pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetIntegerv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetIntegerv`(`pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetLightfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetLightfv`(`light` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetLightiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetLightiv`(`light` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetMapdv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetMapdv`(`target` : UInt, `query` : UInt, `v` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetMapfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetMapfv`(`target` : UInt, `query` : UInt, `v` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetMapiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetMapiv`(`target` : UInt, `query` : UInt, `v` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetMaterialfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetMaterialfv`(`face` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetMaterialiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetMaterialiv`(`face` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetPixelMapfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetPixelMapfv`(`map` : UInt, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetPixelMapuiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetPixelMapuiv`(`map` : UInt, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetPixelMapusv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetPixelMapusv`(`map` : UInt, `values` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetPointerv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetPointerv`(`pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetPolygonStipple; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetPolygonStipple`(`mask` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetString`(`name` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexEnvfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexEnvfv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexEnviv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexEnviv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexGendv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexGendv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexGenfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexGenfv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexGeniv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexGeniv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexImage`(`target` : UInt, `level` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexLevelParameterfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexLevelParameterfv`(`target` : UInt, `level` : Int, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexLevelParameteriv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexLevelParameteriv`(`target` : UInt, `level` : Int, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexParameterfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexParameterfv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glGetTexParameteriv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glGetTexParameteriv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glHint`(`target` : UInt, `mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexMask`(`mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexPointer`(`type` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexd`(`c` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexdv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexdv`(`c` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexf`(`c` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexfv`(`c` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexi`(`c` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexiv`(`c` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexs; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexs`(`c` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexsv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexsv`(`c` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexub; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexub`(`c` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIndexubv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIndexubv`(`c` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glInitNames; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glInitNames`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glInterleavedArrays; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glInterleavedArrays`(`format` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIsEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIsEnabled`(`cap` : UInt) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIsList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIsList`(`list` : UInt) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glIsTexture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glIsTexture`(`texture` : UInt) : UByte
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightModelf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightModelf`(`pname` : UInt, `param1` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightModelfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightModelfv`(`pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightModeli; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightModeli`(`pname` : UInt, `param1` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightModeliv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightModeliv`(`pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightf`(`light` : UInt, `pname` : UInt, `param2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightfv`(`light` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLighti; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLighti`(`light` : UInt, `pname` : UInt, `param2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLightiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLightiv`(`light` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLineStipple; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLineStipple`(`factor` : Int, `pattern` : UShort)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLineWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLineWidth`(`width` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glListBase; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glListBase`(`base` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLoadIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLoadIdentity`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLoadMatrixd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLoadMatrixd`(`m` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLoadMatrixf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLoadMatrixf`(`m` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLoadName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLoadName`(`name` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glLogicOp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glLogicOp`(`opcode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMap1d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMap1d`(`target` : UInt, `u1` : Double, `u2` : Double, `stride` : Int, `order` : Int, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMap1f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMap1f`(`target` : UInt, `u1` : Float, `u2` : Float, `stride` : Int, `order` : Int, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMap2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMap2d`(`target` : UInt, `u1` : Double, `u2` : Double, `ustride` : Int, `uorder` : Int, `v1` : Double, `v2` : Double, `vstride` : Int, `vorder` : Int, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMap2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMap2f`(`target` : UInt, `u1` : Float, `u2` : Float, `ustride` : Int, `uorder` : Int, `v1` : Float, `v2` : Float, `vstride` : Int, `vorder` : Int, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMapGrid1d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMapGrid1d`(`un` : Int, `u1` : Double, `u2` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMapGrid1f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMapGrid1f`(`un` : Int, `u1` : Float, `u2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMapGrid2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMapGrid2d`(`un` : Int, `u1` : Double, `u2` : Double, `vn` : Int, `v1` : Double, `v2` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMapGrid2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMapGrid2f`(`un` : Int, `u1` : Float, `u2` : Float, `vn` : Int, `v1` : Float, `v2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMaterialf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMaterialf`(`face` : UInt, `pname` : UInt, `param2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMaterialfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMaterialfv`(`face` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMateriali; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMateriali`(`face` : UInt, `pname` : UInt, `param2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMaterialiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMaterialiv`(`face` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMatrixMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMatrixMode`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMultMatrixd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMultMatrixd`(`m` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glMultMatrixf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glMultMatrixf`(`m` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNewList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNewList`(`list` : UInt, `mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3b; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3b`(`nx` : Byte, `ny` : Byte, `nz` : Byte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3bv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3bv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3d`(`nx` : Double, `ny` : Double, `nz` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3f`(`nx` : Float, `ny` : Float, `nz` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3i`(`nx` : Int, `ny` : Int, `nz` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3s`(`nx` : Short, `ny` : Short, `nz` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormal3sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormal3sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glNormalPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glNormalPointer`(`type` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glOrtho; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glOrtho`(`left` : Double, `right` : Double, `bottom` : Double, `top` : Double, `znear` : Double, `zfar` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPassThrough; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPassThrough`(`token` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelMapfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelMapfv`(`map` : UInt, `mapsize` : Int, `values` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelMapuiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelMapuiv`(`map` : UInt, `mapsize` : Int, `values` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelMapusv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelMapusv`(`map` : UInt, `mapsize` : Int, `values` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelStoref; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelStoref`(`pname` : UInt, `param1` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelStorei; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelStorei`(`pname` : UInt, `param1` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelTransferf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelTransferf`(`pname` : UInt, `param1` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelTransferi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelTransferi`(`pname` : UInt, `param1` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPixelZoom; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPixelZoom`(`xfactor` : Float, `yfactor` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPointSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPointSize`(`size` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPolygonMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPolygonMode`(`face` : UInt, `mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPolygonOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPolygonOffset`(`factor` : Float, `units` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPolygonStipple; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPolygonStipple`(`mask` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPopAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPopAttrib`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPopClientAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPopClientAttrib`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPopMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPopMatrix`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPopName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPopName`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPrioritizeTextures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPrioritizeTextures`(`n` : Int, `textures` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `priorities` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPushAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPushAttrib`(`mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPushClientAttrib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPushClientAttrib`(`mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPushMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPushMatrix`()
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glPushName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glPushName`(`name` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2d`(`x` : Double, `y` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2f`(`x` : Float, `y` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2i`(`x` : Int, `y` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2s`(`x` : Short, `y` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos2sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos2sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3d`(`x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3f`(`x` : Float, `y` : Float, `z` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3i`(`x` : Int, `y` : Int, `z` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3s`(`x` : Short, `y` : Short, `z` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos3sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos3sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4d`(`x` : Double, `y` : Double, `z` : Double, `w` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4f`(`x` : Float, `y` : Float, `z` : Float, `w` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4i`(`x` : Int, `y` : Int, `z` : Int, `w` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4s`(`x` : Short, `y` : Short, `z` : Short, `w` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRasterPos4sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRasterPos4sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glReadBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glReadBuffer`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glReadPixels; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glReadPixels`(`x` : Int, `y` : Int, `width` : Int, `height` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectd`(`x1` : Double, `y1` : Double, `x2` : Double, `y2` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectdv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectdv`(`v1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `v2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectf`(`x1` : Float, `y1` : Float, `x2` : Float, `y2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectfv`(`v1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `v2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRecti; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRecti`(`x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectiv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectiv`(`v1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `v2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRects; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRects`(`x1` : Short, `y1` : Short, `x2` : Short, `y2` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRectsv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRectsv`(`v1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?, `v2` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRenderMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRenderMode`(`mode` : UInt) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRotated; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRotated`(`angle` : Double, `x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glRotatef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glRotatef`(`angle` : Float, `x` : Float, `y` : Float, `z` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glScaled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glScaled`(`x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glScalef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glScalef`(`x` : Float, `y` : Float, `z` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glScissor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glScissor`(`x` : Int, `y` : Int, `width` : Int, `height` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glSelectBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glSelectBuffer`(`size` : Int, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glShadeModel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glShadeModel`(`mode` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glStencilFunc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glStencilFunc`(`func` : UInt, `ref` : Int, `mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glStencilMask; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glStencilMask`(`mask` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glStencilOp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glStencilOp`(`fail` : UInt, `zfail` : UInt, `zpass` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1d`(`s` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1f`(`s` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1i`(`s` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1s`(`s` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord1sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord1sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2d`(`s` : Double, `t` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2f`(`s` : Float, `t` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2i`(`s` : Int, `t` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2s`(`s` : Short, `t` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord2sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord2sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3d`(`s` : Double, `t` : Double, `r` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3f`(`s` : Float, `t` : Float, `r` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3i`(`s` : Int, `t` : Int, `r` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3s`(`s` : Short, `t` : Short, `r` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord3sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord3sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4d`(`s` : Double, `t` : Double, `r` : Double, `q` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4f`(`s` : Float, `t` : Float, `r` : Float, `q` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4i`(`s` : Int, `t` : Int, `r` : Int, `q` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4s`(`s` : Short, `t` : Short, `r` : Short, `q` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoord4sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoord4sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexCoordPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexCoordPointer`(`size` : Int, `type` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexEnvf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexEnvf`(`target` : UInt, `pname` : UInt, `param2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexEnvfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexEnvfv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexEnvi; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexEnvi`(`target` : UInt, `pname` : UInt, `param2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexEnviv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexEnviv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGend`(`coord` : UInt, `pname` : UInt, `param2` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGendv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGendv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGenf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGenf`(`coord` : UInt, `pname` : UInt, `param2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGenfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGenfv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGeni; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGeni`(`coord` : UInt, `pname` : UInt, `param2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexGeniv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexGeniv`(`coord` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexImage1D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexImage1D`(`target` : UInt, `level` : Int, `internalformat` : Int, `width` : Int, `border` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexImage2D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexImage2D`(`target` : UInt, `level` : Int, `internalformat` : Int, `width` : Int, `height` : Int, `border` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexParameterf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexParameterf`(`target` : UInt, `pname` : UInt, `param2` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexParameterfv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexParameterfv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexParameteri; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexParameteri`(`target` : UInt, `pname` : UInt, `param2` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexParameteriv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexParameteriv`(`target` : UInt, `pname` : UInt, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexSubImage1D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexSubImage1D`(`target` : UInt, `level` : Int, `xoffset` : Int, `width` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTexSubImage2D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTexSubImage2D`(`target` : UInt, `level` : Int, `xoffset` : Int, `yoffset` : Int, `width` : Int, `height` : Int, `format` : UInt, `type` : UInt, `pixels` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTranslated; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTranslated`(`x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glTranslatef; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glTranslatef`(`x` : Float, `y` : Float, `z` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2d`(`x` : Double, `y` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2f`(`x` : Float, `y` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2i`(`x` : Int, `y` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2s`(`x` : Short, `y` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex2sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex2sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3d`(`x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3f`(`x` : Float, `y` : Float, `z` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3i`(`x` : Int, `y` : Int, `z` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3s`(`x` : Short, `y` : Short, `z` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex3sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex3sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4d; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4d`(`x` : Double, `y` : Double, `z` : Double, `w` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4dv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4dv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4f; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4f`(`x` : Float, `y` : Float, `z` : Float, `w` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4fv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4fv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4i; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4i`(`x` : Int, `y` : Int, `z` : Int, `w` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4iv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4iv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4s; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4s`(`x` : Short, `y` : Short, `z` : Short, `w` : Short)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertex4sv; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertex4sv`(`v` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ShortVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glVertexPointer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glVertexPointer`(`size` : Int, `type` : UInt, `stride` : Int, `pointer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=glViewport; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `glViewport`(`x` : Int, `y` : Int, `width` : Int, `height` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBeginCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBeginCurve`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBeginPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBeginPolygon`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBeginSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBeginSurface`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBeginTrim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBeginTrim`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBuild1DMipmaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBuild1DMipmaps`(`target` : UInt, `components` : Int, `width` : Int, `format` : UInt, `type` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluBuild2DMipmaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluBuild2DMipmaps`(`target` : UInt, `components` : Int, `width` : Int, `height` : Int, `format` : UInt, `type` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluCylinder; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluCylinder`(`qobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `baseradius` : Double, `topradius` : Double, `height` : Double, `slices` : Int, `stacks` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluDeleteNurbsRenderer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluDeleteNurbsRenderer`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluDeleteQuadric; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluDeleteQuadric`(`state` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluDeleteTess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluDeleteTess`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluDisk`(`qobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `innerradius` : Double, `outerradius` : Double, `slices` : Int, `loops` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluEndCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluEndCurve`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluEndPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluEndPolygon`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluEndSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluEndSurface`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluEndTrim; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluEndTrim`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluErrorString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluErrorString`(`errcode` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluErrorUnicodeStringEXT; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluErrorUnicodeStringEXT`(`errcode` : UInt) : `windows_sys`.`core`.`PCWSTR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluGetNurbsProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluGetNurbsProperty`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `property` : UInt, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluGetString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluGetString`(`name` : UInt) : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluGetTessProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluGetTessProperty`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `which` : UInt, `value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluLoadSamplingMatrices; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluLoadSamplingMatrices`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `modelmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `projmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `viewport` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluLookAt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluLookAt`(`eyex` : Double, `eyey` : Double, `eyez` : Double, `centerx` : Double, `centery` : Double, `centerz` : Double, `upx` : Double, `upy` : Double, `upz` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNewNurbsRenderer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNewNurbsRenderer`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNewQuadric; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNewQuadric`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNewTess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNewTess`() : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNextContour; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNextContour`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `type` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNurbsCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNurbsCallback`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `which` : UInt, `fn` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNurbsCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNurbsCurve`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `nknots` : Int, `knot` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `stride` : Int, `ctlarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `order` : Int, `type` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNurbsProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNurbsProperty`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `property` : UInt, `value` : Float)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluNurbsSurface; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluNurbsSurface`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `sknot_count` : Int, `sknot` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `tknot_count` : Int, `tknot` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `s_stride` : Int, `t_stride` : Int, `ctlarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `sorder` : Int, `torder` : Int, `type` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluOrtho2D; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluOrtho2D`(`left` : Double, `right` : Double, `bottom` : Double, `top` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluPartialDisk; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluPartialDisk`(`qobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `innerradius` : Double, `outerradius` : Double, `slices` : Int, `loops` : Int, `startangle` : Double, `sweepangle` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluPerspective; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluPerspective`(`fovy` : Double, `aspect` : Double, `znear` : Double, `zfar` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluPickMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluPickMatrix`(`x` : Double, `y` : Double, `width` : Double, `height` : Double, `viewport` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluProject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluProject`(`objx` : Double, `objy` : Double, `objz` : Double, `modelmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `projmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `viewport` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `winx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `winy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `winz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluPwlCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluPwlCurve`(`nobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUnurbs`>?, `count` : Int, `array` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `stride` : Int, `type` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluQuadricCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluQuadricCallback`(`qobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `which` : UInt, `fn` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluQuadricDrawStyle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluQuadricDrawStyle`(`quadobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `drawstyle` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluQuadricNormals; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluQuadricNormals`(`quadobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `normals` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluQuadricOrientation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluQuadricOrientation`(`quadobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `orientation` : UInt)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluQuadricTexture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluQuadricTexture`(`quadobject` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `texturecoords` : UByte)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluScaleImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluScaleImage`(`format` : UInt, `widthin` : Int, `heightin` : Int, `typein` : UInt, `datain` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `widthout` : Int, `heightout` : Int, `typeout` : UInt, `dataout` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluSphere; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluSphere`(`qobj` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUquadric`>?, `radius` : Double, `slices` : Int, `stacks` : Int)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessBeginContour; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessBeginContour`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessBeginPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessBeginPolygon`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `polygon_data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessCallback`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `which` : UInt, `fn` : Long)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessEndContour; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessEndContour`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessEndPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessEndPolygon`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessNormal; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessNormal`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `x` : Double, `y` : Double, `z` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessProperty`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `which` : UInt, `value` : Double)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluTessVertex; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluTessVertex`(`tess` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLUtesselator`>?, `coords` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=glu32.dll, ABI=system, export=gluUnProject; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `gluUnProject`(`winx` : Double, `winy` : Double, `winz` : Double, `modelmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `projmatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `viewport` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `objx` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `objy` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, `objz` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglCopyContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglCopyContext`(`param0` : `HGLRC`, `param1` : `HGLRC`, `param2` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglCreateContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglCreateContext`(`param0` : `super`.`Gdi`.`HDC`) : `HGLRC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglCreateLayerContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglCreateLayerContext`(`param0` : `super`.`Gdi`.`HDC`, `param1` : Int) : `HGLRC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglDeleteContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglDeleteContext`(`param0` : `HGLRC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglDescribeLayerPlane; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglDescribeLayerPlane`(`param0` : `super`.`Gdi`.`HDC`, `param1` : Int, `param2` : Int, `param3` : UInt, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LAYERPLANEDESCRIPTOR`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglGetCurrentContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglGetCurrentContext`() : `HGLRC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglGetCurrentDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglGetCurrentDC`() : `super`.`Gdi`.`HDC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglGetLayerPaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglGetLayerPaletteEntries`(`param0` : `super`.`Gdi`.`HDC`, `param1` : Int, `param2` : Int, `param3` : Int, `param4` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglGetProcAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglGetProcAddress`(`param0` : `windows_sys`.`core`.`PCSTR`) : `super`.`super`.`Foundation`.`PROC`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglMakeCurrent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglMakeCurrent`(`param0` : `super`.`Gdi`.`HDC`, `param1` : `HGLRC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglRealizeLayerPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglRealizeLayerPalette`(`param0` : `super`.`Gdi`.`HDC`, `param1` : Int, `param2` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglSetLayerPaletteEntries; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglSetLayerPaletteEntries`(`param0` : `super`.`Gdi`.`HDC`, `param1` : Int, `param2` : Int, `param3` : Int, `param4` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`COLORREF`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglShareLists; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `wglShareLists`(`param0` : `HGLRC`, `param1` : `HGLRC`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglSwapLayerBuffers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglSwapLayerBuffers`(`param0` : `super`.`Gdi`.`HDC`, `param1` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglUseFontBitmapsA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglUseFontBitmapsA`(`param0` : `super`.`Gdi`.`HDC`, `param1` : UInt, `param2` : UInt, `param3` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglUseFontBitmapsW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglUseFontBitmapsW`(`param0` : `super`.`Gdi`.`HDC`, `param1` : UInt, `param2` : UInt, `param3` : UInt) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglUseFontOutlinesA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglUseFontOutlinesA`(`param0` : `super`.`Gdi`.`HDC`, `param1` : UInt, `param2` : UInt, `param3` : UInt, `param4` : Float, `param5` : Float, `param6` : Int, `param7` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHMETRICSFLOAT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=opengl32.dll, ABI=system, export=wglUseFontOutlinesW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `wglUseFontOutlinesW`(`param0` : `super`.`Gdi`.`HDC`, `param1` : UInt, `param2` : UInt, `param3` : UInt, `param4` : Float, `param5` : Float, `param6` : Int, `param7` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GLYPHMETRICSFLOAT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `EMRPIXELFORMAT` (
    public var `emr`: `super`.`Gdi`.`EMR`,
    public var `pfd`: `PIXELFORMATDESCRIPTOR`,
)
public const val `GLU_AUTO_LOAD_MATRIX`: UInt = 100200u;
public const val `GLU_BEGIN`: UInt = 100100u;
public const val `GLU_CCW`: UInt = 100121u;
public const val `GLU_CULLING`: UInt = 100201u;
public const val `GLU_CW`: UInt = 100120u;
public const val `GLU_DISPLAY_MODE`: UInt = 100204u;
public const val `GLU_DOMAIN_DISTANCE`: UInt = 100217u;
public const val `GLU_EDGE_FLAG`: UInt = 100104u;
public const val `GLU_END`: UInt = 100102u;
public const val `GLU_ERROR`: UInt = 100103u;
public const val `GLU_EXTENSIONS`: UInt = 100801u;
public const val `GLU_EXTERIOR`: UInt = 100123u;
public const val `GLU_FALSE`: UInt = 0u;
public const val `GLU_FILL`: UInt = 100012u;
public const val `GLU_FLAT`: UInt = 100001u;
public const val `GLU_INCOMPATIBLE_GL_VERSION`: UInt = 100903u;
public const val `GLU_INSIDE`: UInt = 100021u;
public const val `GLU_INTERIOR`: UInt = 100122u;
public const val `GLU_INVALID_ENUM`: UInt = 100900u;
public const val `GLU_INVALID_VALUE`: UInt = 100901u;
public const val `GLU_LINE`: UInt = 100011u;
public const val `GLU_MAP1_TRIM_2`: UInt = 100210u;
public const val `GLU_MAP1_TRIM_3`: UInt = 100211u;
public const val `GLU_NONE`: UInt = 100002u;
public const val `GLU_NURBS_ERROR1`: UInt = 100251u;
public const val `GLU_NURBS_ERROR10`: UInt = 100260u;
public const val `GLU_NURBS_ERROR11`: UInt = 100261u;
public const val `GLU_NURBS_ERROR12`: UInt = 100262u;
public const val `GLU_NURBS_ERROR13`: UInt = 100263u;
public const val `GLU_NURBS_ERROR14`: UInt = 100264u;
public const val `GLU_NURBS_ERROR15`: UInt = 100265u;
public const val `GLU_NURBS_ERROR16`: UInt = 100266u;
public const val `GLU_NURBS_ERROR17`: UInt = 100267u;
public const val `GLU_NURBS_ERROR18`: UInt = 100268u;
public const val `GLU_NURBS_ERROR19`: UInt = 100269u;
public const val `GLU_NURBS_ERROR2`: UInt = 100252u;
public const val `GLU_NURBS_ERROR20`: UInt = 100270u;
public const val `GLU_NURBS_ERROR21`: UInt = 100271u;
public const val `GLU_NURBS_ERROR22`: UInt = 100272u;
public const val `GLU_NURBS_ERROR23`: UInt = 100273u;
public const val `GLU_NURBS_ERROR24`: UInt = 100274u;
public const val `GLU_NURBS_ERROR25`: UInt = 100275u;
public const val `GLU_NURBS_ERROR26`: UInt = 100276u;
public const val `GLU_NURBS_ERROR27`: UInt = 100277u;
public const val `GLU_NURBS_ERROR28`: UInt = 100278u;
public const val `GLU_NURBS_ERROR29`: UInt = 100279u;
public const val `GLU_NURBS_ERROR3`: UInt = 100253u;
public const val `GLU_NURBS_ERROR30`: UInt = 100280u;
public const val `GLU_NURBS_ERROR31`: UInt = 100281u;
public const val `GLU_NURBS_ERROR32`: UInt = 100282u;
public const val `GLU_NURBS_ERROR33`: UInt = 100283u;
public const val `GLU_NURBS_ERROR34`: UInt = 100284u;
public const val `GLU_NURBS_ERROR35`: UInt = 100285u;
public const val `GLU_NURBS_ERROR36`: UInt = 100286u;
public const val `GLU_NURBS_ERROR37`: UInt = 100287u;
public const val `GLU_NURBS_ERROR4`: UInt = 100254u;
public const val `GLU_NURBS_ERROR5`: UInt = 100255u;
public const val `GLU_NURBS_ERROR6`: UInt = 100256u;
public const val `GLU_NURBS_ERROR7`: UInt = 100257u;
public const val `GLU_NURBS_ERROR8`: UInt = 100258u;
public const val `GLU_NURBS_ERROR9`: UInt = 100259u;
public const val `GLU_OUTLINE_PATCH`: UInt = 100241u;
public const val `GLU_OUTLINE_POLYGON`: UInt = 100240u;
public const val `GLU_OUTSIDE`: UInt = 100020u;
public const val `GLU_OUT_OF_MEMORY`: UInt = 100902u;
public const val `GLU_PARAMETRIC_ERROR`: UInt = 100216u;
public const val `GLU_PARAMETRIC_TOLERANCE`: UInt = 100202u;
public const val `GLU_PATH_LENGTH`: UInt = 100215u;
public const val `GLU_POINT`: UInt = 100010u;
public const val `GLU_SAMPLING_METHOD`: UInt = 100205u;
public const val `GLU_SAMPLING_TOLERANCE`: UInt = 100203u;
public const val `GLU_SILHOUETTE`: UInt = 100013u;
public const val `GLU_SMOOTH`: UInt = 100000u;
public const val `GLU_TESS_BEGIN`: UInt = 100100u;
public const val `GLU_TESS_BEGIN_DATA`: UInt = 100106u;
public const val `GLU_TESS_BOUNDARY_ONLY`: UInt = 100141u;
public const val `GLU_TESS_COMBINE`: UInt = 100105u;
public const val `GLU_TESS_COMBINE_DATA`: UInt = 100111u;
public const val `GLU_TESS_COORD_TOO_LARGE`: UInt = 100155u;
public const val `GLU_TESS_EDGE_FLAG`: UInt = 100104u;
public const val `GLU_TESS_EDGE_FLAG_DATA`: UInt = 100110u;
public const val `GLU_TESS_END`: UInt = 100102u;
public const val `GLU_TESS_END_DATA`: UInt = 100108u;
public const val `GLU_TESS_ERROR`: UInt = 100103u;
public const val `GLU_TESS_ERROR1`: UInt = 100151u;
public const val `GLU_TESS_ERROR2`: UInt = 100152u;
public const val `GLU_TESS_ERROR3`: UInt = 100153u;
public const val `GLU_TESS_ERROR4`: UInt = 100154u;
public const val `GLU_TESS_ERROR5`: UInt = 100155u;
public const val `GLU_TESS_ERROR6`: UInt = 100156u;
public const val `GLU_TESS_ERROR7`: UInt = 100157u;
public const val `GLU_TESS_ERROR8`: UInt = 100158u;
public const val `GLU_TESS_ERROR_DATA`: UInt = 100109u;
public const val `GLU_TESS_MISSING_BEGIN_CONTOUR`: UInt = 100152u;
public const val `GLU_TESS_MISSING_BEGIN_POLYGON`: UInt = 100151u;
public const val `GLU_TESS_MISSING_END_CONTOUR`: UInt = 100154u;
public const val `GLU_TESS_MISSING_END_POLYGON`: UInt = 100153u;
public const val `GLU_TESS_NEED_COMBINE_CALLBACK`: UInt = 100156u;
public const val `GLU_TESS_TOLERANCE`: UInt = 100142u;
public const val `GLU_TESS_VERTEX`: UInt = 100101u;
public const val `GLU_TESS_VERTEX_DATA`: UInt = 100107u;
public const val `GLU_TESS_WINDING_ABS_GEQ_TWO`: UInt = 100134u;
public const val `GLU_TESS_WINDING_NEGATIVE`: UInt = 100133u;
public const val `GLU_TESS_WINDING_NONZERO`: UInt = 100131u;
public const val `GLU_TESS_WINDING_ODD`: UInt = 100130u;
public const val `GLU_TESS_WINDING_POSITIVE`: UInt = 100132u;
public const val `GLU_TESS_WINDING_RULE`: UInt = 100140u;
public const val `GLU_TRUE`: UInt = 1u;
public const val `GLU_UNKNOWN`: UInt = 100124u;
public const val `GLU_U_STEP`: UInt = 100206u;
public const val `GLU_VERSION`: UInt = 100800u;
public const val `GLU_VERSION_1_1`: UInt = 1u;
public const val `GLU_VERSION_1_2`: UInt = 1u;
public const val `GLU_VERTEX`: UInt = 100101u;
public const val `GLU_V_STEP`: UInt = 100207u;
public typealias `GLUnurbs` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUnurbsErrorProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
public typealias `GLUquadric` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUquadricErrorProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessBeginDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessBeginProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessCombineDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessCombineProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessEdgeFlagDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessEdgeFlagProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UByte) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessEndDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessEndProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessErrorDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessErrorProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessVertexDataProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GLUtessVertexProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `GLUtesselator` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GLYPHMETRICSFLOAT` (
    public var `gmfBlackBoxX`: Float,
    public var `gmfBlackBoxY`: Float,
    public var `gmfptGlyphOrigin`: `POINTFLOAT`,
    public var `gmfCellIncX`: Float,
    public var `gmfCellIncY`: Float,
)
public const val `GL_2D`: UInt = 1536u;
public const val `GL_2_BYTES`: UInt = 5127u;
public const val `GL_3D`: UInt = 1537u;
public const val `GL_3D_COLOR`: UInt = 1538u;
public const val `GL_3D_COLOR_TEXTURE`: UInt = 1539u;
public const val `GL_3_BYTES`: UInt = 5128u;
public const val `GL_4D_COLOR_TEXTURE`: UInt = 1540u;
public const val `GL_4_BYTES`: UInt = 5129u;
public const val `GL_ACCUM`: UInt = 256u;
public const val `GL_ACCUM_ALPHA_BITS`: UInt = 3419u;
public const val `GL_ACCUM_BLUE_BITS`: UInt = 3418u;
public const val `GL_ACCUM_BUFFER_BIT`: UInt = 512u;
public const val `GL_ACCUM_CLEAR_VALUE`: UInt = 2944u;
public const val `GL_ACCUM_GREEN_BITS`: UInt = 3417u;
public const val `GL_ACCUM_RED_BITS`: UInt = 3416u;
public const val `GL_ADD`: UInt = 260u;
public const val `GL_ALL_ATTRIB_BITS`: UInt = 1048575u;
public const val `GL_ALPHA`: UInt = 6406u;
public const val `GL_ALPHA12`: UInt = 32829u;
public const val `GL_ALPHA16`: UInt = 32830u;
public const val `GL_ALPHA4`: UInt = 32827u;
public const val `GL_ALPHA8`: UInt = 32828u;
public const val `GL_ALPHA_BIAS`: UInt = 3357u;
public const val `GL_ALPHA_BITS`: UInt = 3413u;
public const val `GL_ALPHA_SCALE`: UInt = 3356u;
public const val `GL_ALPHA_TEST`: UInt = 3008u;
public const val `GL_ALPHA_TEST_FUNC`: UInt = 3009u;
public const val `GL_ALPHA_TEST_REF`: UInt = 3010u;
public const val `GL_ALWAYS`: UInt = 519u;
public const val `GL_AMBIENT`: UInt = 4608u;
public const val `GL_AMBIENT_AND_DIFFUSE`: UInt = 5634u;
public const val `GL_AND`: UInt = 5377u;
public const val `GL_AND_INVERTED`: UInt = 5380u;
public const val `GL_AND_REVERSE`: UInt = 5378u;
public const val `GL_ATTRIB_STACK_DEPTH`: UInt = 2992u;
public const val `GL_AUTO_NORMAL`: UInt = 3456u;
public const val `GL_AUX0`: UInt = 1033u;
public const val `GL_AUX1`: UInt = 1034u;
public const val `GL_AUX2`: UInt = 1035u;
public const val `GL_AUX3`: UInt = 1036u;
public const val `GL_AUX_BUFFERS`: UInt = 3072u;
public const val `GL_BACK`: UInt = 1029u;
public const val `GL_BACK_LEFT`: UInt = 1026u;
public const val `GL_BACK_RIGHT`: UInt = 1027u;
public const val `GL_BGRA_EXT`: UInt = 32993u;
public const val `GL_BGR_EXT`: UInt = 32992u;
public const val `GL_BITMAP`: UInt = 6656u;
public const val `GL_BITMAP_TOKEN`: UInt = 1796u;
public const val `GL_BLEND`: UInt = 3042u;
public const val `GL_BLEND_DST`: UInt = 3040u;
public const val `GL_BLEND_SRC`: UInt = 3041u;
public const val `GL_BLUE`: UInt = 6405u;
public const val `GL_BLUE_BIAS`: UInt = 3355u;
public const val `GL_BLUE_BITS`: UInt = 3412u;
public const val `GL_BLUE_SCALE`: UInt = 3354u;
public const val `GL_BYTE`: UInt = 5120u;
public const val `GL_C3F_V3F`: UInt = 10788u;
public const val `GL_C4F_N3F_V3F`: UInt = 10790u;
public const val `GL_C4UB_V2F`: UInt = 10786u;
public const val `GL_C4UB_V3F`: UInt = 10787u;
public const val `GL_CCW`: UInt = 2305u;
public const val `GL_CLAMP`: UInt = 10496u;
public const val `GL_CLEAR`: UInt = 5376u;
public const val `GL_CLIENT_ALL_ATTRIB_BITS`: UInt = 4294967295u;
public const val `GL_CLIENT_ATTRIB_STACK_DEPTH`: UInt = 2993u;
public const val `GL_CLIENT_PIXEL_STORE_BIT`: UInt = 1u;
public const val `GL_CLIENT_VERTEX_ARRAY_BIT`: UInt = 2u;
public const val `GL_CLIP_PLANE0`: UInt = 12288u;
public const val `GL_CLIP_PLANE1`: UInt = 12289u;
public const val `GL_CLIP_PLANE2`: UInt = 12290u;
public const val `GL_CLIP_PLANE3`: UInt = 12291u;
public const val `GL_CLIP_PLANE4`: UInt = 12292u;
public const val `GL_CLIP_PLANE5`: UInt = 12293u;
public const val `GL_COEFF`: UInt = 2560u;
public const val `GL_COLOR`: UInt = 6144u;
public const val `GL_COLOR_ARRAY`: UInt = 32886u;
public const val `GL_COLOR_ARRAY_COUNT_EXT`: UInt = 32900u;
public const val `GL_COLOR_ARRAY_EXT`: UInt = 32886u;
public const val `GL_COLOR_ARRAY_POINTER`: UInt = 32912u;
public const val `GL_COLOR_ARRAY_POINTER_EXT`: UInt = 32912u;
public const val `GL_COLOR_ARRAY_SIZE`: UInt = 32897u;
public const val `GL_COLOR_ARRAY_SIZE_EXT`: UInt = 32897u;
public const val `GL_COLOR_ARRAY_STRIDE`: UInt = 32899u;
public const val `GL_COLOR_ARRAY_STRIDE_EXT`: UInt = 32899u;
public const val `GL_COLOR_ARRAY_TYPE`: UInt = 32898u;
public const val `GL_COLOR_ARRAY_TYPE_EXT`: UInt = 32898u;
public const val `GL_COLOR_BUFFER_BIT`: UInt = 16384u;
public const val `GL_COLOR_CLEAR_VALUE`: UInt = 3106u;
public const val `GL_COLOR_INDEX`: UInt = 6400u;
public const val `GL_COLOR_INDEX12_EXT`: UInt = 32998u;
public const val `GL_COLOR_INDEX16_EXT`: UInt = 32999u;
public const val `GL_COLOR_INDEX1_EXT`: UInt = 32994u;
public const val `GL_COLOR_INDEX2_EXT`: UInt = 32995u;
public const val `GL_COLOR_INDEX4_EXT`: UInt = 32996u;
public const val `GL_COLOR_INDEX8_EXT`: UInt = 32997u;
public const val `GL_COLOR_INDEXES`: UInt = 5635u;
public const val `GL_COLOR_LOGIC_OP`: UInt = 3058u;
public const val `GL_COLOR_MATERIAL`: UInt = 2903u;
public const val `GL_COLOR_MATERIAL_FACE`: UInt = 2901u;
public const val `GL_COLOR_MATERIAL_PARAMETER`: UInt = 2902u;
public const val `GL_COLOR_TABLE_ALPHA_SIZE_EXT`: UInt = 32989u;
public const val `GL_COLOR_TABLE_BLUE_SIZE_EXT`: UInt = 32988u;
public const val `GL_COLOR_TABLE_FORMAT_EXT`: UInt = 32984u;
public const val `GL_COLOR_TABLE_GREEN_SIZE_EXT`: UInt = 32987u;
public const val `GL_COLOR_TABLE_INTENSITY_SIZE_EXT`: UInt = 32991u;
public const val `GL_COLOR_TABLE_LUMINANCE_SIZE_EXT`: UInt = 32990u;
public const val `GL_COLOR_TABLE_RED_SIZE_EXT`: UInt = 32986u;
public const val `GL_COLOR_TABLE_WIDTH_EXT`: UInt = 32985u;
public const val `GL_COLOR_WRITEMASK`: UInt = 3107u;
public const val `GL_COMPILE`: UInt = 4864u;
public const val `GL_COMPILE_AND_EXECUTE`: UInt = 4865u;
public const val `GL_CONSTANT_ATTENUATION`: UInt = 4615u;
public const val `GL_COPY`: UInt = 5379u;
public const val `GL_COPY_INVERTED`: UInt = 5388u;
public const val `GL_COPY_PIXEL_TOKEN`: UInt = 1798u;
public const val `GL_CULL_FACE`: UInt = 2884u;
public const val `GL_CULL_FACE_MODE`: UInt = 2885u;
public const val `GL_CURRENT_BIT`: UInt = 1u;
public const val `GL_CURRENT_COLOR`: UInt = 2816u;
public const val `GL_CURRENT_INDEX`: UInt = 2817u;
public const val `GL_CURRENT_NORMAL`: UInt = 2818u;
public const val `GL_CURRENT_RASTER_COLOR`: UInt = 2820u;
public const val `GL_CURRENT_RASTER_DISTANCE`: UInt = 2825u;
public const val `GL_CURRENT_RASTER_INDEX`: UInt = 2821u;
public const val `GL_CURRENT_RASTER_POSITION`: UInt = 2823u;
public const val `GL_CURRENT_RASTER_POSITION_VALID`: UInt = 2824u;
public const val `GL_CURRENT_RASTER_TEXTURE_COORDS`: UInt = 2822u;
public const val `GL_CURRENT_TEXTURE_COORDS`: UInt = 2819u;
public const val `GL_CW`: UInt = 2304u;
public const val `GL_DECAL`: UInt = 8449u;
public const val `GL_DECR`: UInt = 7683u;
public const val `GL_DEPTH`: UInt = 6145u;
public const val `GL_DEPTH_BIAS`: UInt = 3359u;
public const val `GL_DEPTH_BITS`: UInt = 3414u;
public const val `GL_DEPTH_BUFFER_BIT`: UInt = 256u;
public const val `GL_DEPTH_CLEAR_VALUE`: UInt = 2931u;
public const val `GL_DEPTH_COMPONENT`: UInt = 6402u;
public const val `GL_DEPTH_FUNC`: UInt = 2932u;
public const val `GL_DEPTH_RANGE`: UInt = 2928u;
public const val `GL_DEPTH_SCALE`: UInt = 3358u;
public const val `GL_DEPTH_TEST`: UInt = 2929u;
public const val `GL_DEPTH_WRITEMASK`: UInt = 2930u;
public const val `GL_DIFFUSE`: UInt = 4609u;
public const val `GL_DITHER`: UInt = 3024u;
public const val `GL_DOMAIN`: UInt = 2562u;
public const val `GL_DONT_CARE`: UInt = 4352u;
public const val `GL_DOUBLE`: UInt = 5130u;
public const val `GL_DOUBLEBUFFER`: UInt = 3122u;
public const val `GL_DOUBLE_EXT`: UInt = 5130u;
public const val `GL_DRAW_BUFFER`: UInt = 3073u;
public const val `GL_DRAW_PIXEL_TOKEN`: UInt = 1797u;
public const val `GL_DST_ALPHA`: UInt = 772u;
public const val `GL_DST_COLOR`: UInt = 774u;
public const val `GL_EDGE_FLAG`: UInt = 2883u;
public const val `GL_EDGE_FLAG_ARRAY`: UInt = 32889u;
public const val `GL_EDGE_FLAG_ARRAY_COUNT_EXT`: UInt = 32909u;
public const val `GL_EDGE_FLAG_ARRAY_EXT`: UInt = 32889u;
public const val `GL_EDGE_FLAG_ARRAY_POINTER`: UInt = 32915u;
public const val `GL_EDGE_FLAG_ARRAY_POINTER_EXT`: UInt = 32915u;
public const val `GL_EDGE_FLAG_ARRAY_STRIDE`: UInt = 32908u;
public const val `GL_EDGE_FLAG_ARRAY_STRIDE_EXT`: UInt = 32908u;
public const val `GL_EMISSION`: UInt = 5632u;
public const val `GL_ENABLE_BIT`: UInt = 8192u;
public const val `GL_EQUAL`: UInt = 514u;
public const val `GL_EQUIV`: UInt = 5385u;
public const val `GL_EVAL_BIT`: UInt = 65536u;
public const val `GL_EXP`: UInt = 2048u;
public const val `GL_EXP2`: UInt = 2049u;
public const val `GL_EXTENSIONS`: UInt = 7939u;
public const val `GL_EXT_bgra`: UInt = 1u;
public const val `GL_EXT_paletted_texture`: UInt = 1u;
public const val `GL_EXT_vertex_array`: UInt = 1u;
public const val `GL_EYE_LINEAR`: UInt = 9216u;
public const val `GL_EYE_PLANE`: UInt = 9474u;
public const val `GL_FALSE`: UInt = 0u;
public const val `GL_FASTEST`: UInt = 4353u;
public const val `GL_FEEDBACK`: UInt = 7169u;
public const val `GL_FEEDBACK_BUFFER_POINTER`: UInt = 3568u;
public const val `GL_FEEDBACK_BUFFER_SIZE`: UInt = 3569u;
public const val `GL_FEEDBACK_BUFFER_TYPE`: UInt = 3570u;
public const val `GL_FILL`: UInt = 6914u;
public const val `GL_FLAT`: UInt = 7424u;
public const val `GL_FLOAT`: UInt = 5126u;
public const val `GL_FOG`: UInt = 2912u;
public const val `GL_FOG_BIT`: UInt = 128u;
public const val `GL_FOG_COLOR`: UInt = 2918u;
public const val `GL_FOG_DENSITY`: UInt = 2914u;
public const val `GL_FOG_END`: UInt = 2916u;
public const val `GL_FOG_HINT`: UInt = 3156u;
public const val `GL_FOG_INDEX`: UInt = 2913u;
public const val `GL_FOG_MODE`: UInt = 2917u;
public const val `GL_FOG_SPECULAR_TEXTURE_WIN`: UInt = 33004u;
public const val `GL_FOG_START`: UInt = 2915u;
public const val `GL_FRONT`: UInt = 1028u;
public const val `GL_FRONT_AND_BACK`: UInt = 1032u;
public const val `GL_FRONT_FACE`: UInt = 2886u;
public const val `GL_FRONT_LEFT`: UInt = 1024u;
public const val `GL_FRONT_RIGHT`: UInt = 1025u;
public const val `GL_GEQUAL`: UInt = 518u;
public const val `GL_GREATER`: UInt = 516u;
public const val `GL_GREEN`: UInt = 6404u;
public const val `GL_GREEN_BIAS`: UInt = 3353u;
public const val `GL_GREEN_BITS`: UInt = 3411u;
public const val `GL_GREEN_SCALE`: UInt = 3352u;
public const val `GL_HINT_BIT`: UInt = 32768u;
public const val `GL_INCR`: UInt = 7682u;
public const val `GL_INDEX_ARRAY`: UInt = 32887u;
public const val `GL_INDEX_ARRAY_COUNT_EXT`: UInt = 32903u;
public const val `GL_INDEX_ARRAY_EXT`: UInt = 32887u;
public const val `GL_INDEX_ARRAY_POINTER`: UInt = 32913u;
public const val `GL_INDEX_ARRAY_POINTER_EXT`: UInt = 32913u;
public const val `GL_INDEX_ARRAY_STRIDE`: UInt = 32902u;
public const val `GL_INDEX_ARRAY_STRIDE_EXT`: UInt = 32902u;
public const val `GL_INDEX_ARRAY_TYPE`: UInt = 32901u;
public const val `GL_INDEX_ARRAY_TYPE_EXT`: UInt = 32901u;
public const val `GL_INDEX_BITS`: UInt = 3409u;
public const val `GL_INDEX_CLEAR_VALUE`: UInt = 3104u;
public const val `GL_INDEX_LOGIC_OP`: UInt = 3057u;
public const val `GL_INDEX_MODE`: UInt = 3120u;
public const val `GL_INDEX_OFFSET`: UInt = 3347u;
public const val `GL_INDEX_SHIFT`: UInt = 3346u;
public const val `GL_INDEX_WRITEMASK`: UInt = 3105u;
public const val `GL_INT`: UInt = 5124u;
public const val `GL_INTENSITY`: UInt = 32841u;
public const val `GL_INTENSITY12`: UInt = 32844u;
public const val `GL_INTENSITY16`: UInt = 32845u;
public const val `GL_INTENSITY4`: UInt = 32842u;
public const val `GL_INTENSITY8`: UInt = 32843u;
public const val `GL_INVALID_ENUM`: UInt = 1280u;
public const val `GL_INVALID_OPERATION`: UInt = 1282u;
public const val `GL_INVALID_VALUE`: UInt = 1281u;
public const val `GL_INVERT`: UInt = 5386u;
public const val `GL_KEEP`: UInt = 7680u;
public const val `GL_LEFT`: UInt = 1030u;
public const val `GL_LEQUAL`: UInt = 515u;
public const val `GL_LESS`: UInt = 513u;
public const val `GL_LIGHT0`: UInt = 16384u;
public const val `GL_LIGHT1`: UInt = 16385u;
public const val `GL_LIGHT2`: UInt = 16386u;
public const val `GL_LIGHT3`: UInt = 16387u;
public const val `GL_LIGHT4`: UInt = 16388u;
public const val `GL_LIGHT5`: UInt = 16389u;
public const val `GL_LIGHT6`: UInt = 16390u;
public const val `GL_LIGHT7`: UInt = 16391u;
public const val `GL_LIGHTING`: UInt = 2896u;
public const val `GL_LIGHTING_BIT`: UInt = 64u;
public const val `GL_LIGHT_MODEL_AMBIENT`: UInt = 2899u;
public const val `GL_LIGHT_MODEL_LOCAL_VIEWER`: UInt = 2897u;
public const val `GL_LIGHT_MODEL_TWO_SIDE`: UInt = 2898u;
public const val `GL_LINE`: UInt = 6913u;
public const val `GL_LINEAR`: UInt = 9729u;
public const val `GL_LINEAR_ATTENUATION`: UInt = 4616u;
public const val `GL_LINEAR_MIPMAP_LINEAR`: UInt = 9987u;
public const val `GL_LINEAR_MIPMAP_NEAREST`: UInt = 9985u;
public const val `GL_LINES`: UInt = 1u;
public const val `GL_LINE_BIT`: UInt = 4u;
public const val `GL_LINE_LOOP`: UInt = 2u;
public const val `GL_LINE_RESET_TOKEN`: UInt = 1799u;
public const val `GL_LINE_SMOOTH`: UInt = 2848u;
public const val `GL_LINE_SMOOTH_HINT`: UInt = 3154u;
public const val `GL_LINE_STIPPLE`: UInt = 2852u;
public const val `GL_LINE_STIPPLE_PATTERN`: UInt = 2853u;
public const val `GL_LINE_STIPPLE_REPEAT`: UInt = 2854u;
public const val `GL_LINE_STRIP`: UInt = 3u;
public const val `GL_LINE_TOKEN`: UInt = 1794u;
public const val `GL_LINE_WIDTH`: UInt = 2849u;
public const val `GL_LINE_WIDTH_GRANULARITY`: UInt = 2851u;
public const val `GL_LINE_WIDTH_RANGE`: UInt = 2850u;
public const val `GL_LIST_BASE`: UInt = 2866u;
public const val `GL_LIST_BIT`: UInt = 131072u;
public const val `GL_LIST_INDEX`: UInt = 2867u;
public const val `GL_LIST_MODE`: UInt = 2864u;
public const val `GL_LOAD`: UInt = 257u;
public const val `GL_LOGIC_OP`: UInt = 3057u;
public const val `GL_LOGIC_OP_MODE`: UInt = 3056u;
public const val `GL_LUMINANCE`: UInt = 6409u;
public const val `GL_LUMINANCE12`: UInt = 32833u;
public const val `GL_LUMINANCE12_ALPHA12`: UInt = 32839u;
public const val `GL_LUMINANCE12_ALPHA4`: UInt = 32838u;
public const val `GL_LUMINANCE16`: UInt = 32834u;
public const val `GL_LUMINANCE16_ALPHA16`: UInt = 32840u;
public const val `GL_LUMINANCE4`: UInt = 32831u;
public const val `GL_LUMINANCE4_ALPHA4`: UInt = 32835u;
public const val `GL_LUMINANCE6_ALPHA2`: UInt = 32836u;
public const val `GL_LUMINANCE8`: UInt = 32832u;
public const val `GL_LUMINANCE8_ALPHA8`: UInt = 32837u;
public const val `GL_LUMINANCE_ALPHA`: UInt = 6410u;
public const val `GL_MAP1_COLOR_4`: UInt = 3472u;
public const val `GL_MAP1_GRID_DOMAIN`: UInt = 3536u;
public const val `GL_MAP1_GRID_SEGMENTS`: UInt = 3537u;
public const val `GL_MAP1_INDEX`: UInt = 3473u;
public const val `GL_MAP1_NORMAL`: UInt = 3474u;
public const val `GL_MAP1_TEXTURE_COORD_1`: UInt = 3475u;
public const val `GL_MAP1_TEXTURE_COORD_2`: UInt = 3476u;
public const val `GL_MAP1_TEXTURE_COORD_3`: UInt = 3477u;
public const val `GL_MAP1_TEXTURE_COORD_4`: UInt = 3478u;
public const val `GL_MAP1_VERTEX_3`: UInt = 3479u;
public const val `GL_MAP1_VERTEX_4`: UInt = 3480u;
public const val `GL_MAP2_COLOR_4`: UInt = 3504u;
public const val `GL_MAP2_GRID_DOMAIN`: UInt = 3538u;
public const val `GL_MAP2_GRID_SEGMENTS`: UInt = 3539u;
public const val `GL_MAP2_INDEX`: UInt = 3505u;
public const val `GL_MAP2_NORMAL`: UInt = 3506u;
public const val `GL_MAP2_TEXTURE_COORD_1`: UInt = 3507u;
public const val `GL_MAP2_TEXTURE_COORD_2`: UInt = 3508u;
public const val `GL_MAP2_TEXTURE_COORD_3`: UInt = 3509u;
public const val `GL_MAP2_TEXTURE_COORD_4`: UInt = 3510u;
public const val `GL_MAP2_VERTEX_3`: UInt = 3511u;
public const val `GL_MAP2_VERTEX_4`: UInt = 3512u;
public const val `GL_MAP_COLOR`: UInt = 3344u;
public const val `GL_MAP_STENCIL`: UInt = 3345u;
public const val `GL_MATRIX_MODE`: UInt = 2976u;
public const val `GL_MAX_ATTRIB_STACK_DEPTH`: UInt = 3381u;
public const val `GL_MAX_CLIENT_ATTRIB_STACK_DEPTH`: UInt = 3387u;
public const val `GL_MAX_CLIP_PLANES`: UInt = 3378u;
public const val `GL_MAX_ELEMENTS_INDICES_WIN`: UInt = 33001u;
public const val `GL_MAX_ELEMENTS_VERTICES_WIN`: UInt = 33000u;
public const val `GL_MAX_EVAL_ORDER`: UInt = 3376u;
public const val `GL_MAX_LIGHTS`: UInt = 3377u;
public const val `GL_MAX_LIST_NESTING`: UInt = 2865u;
public const val `GL_MAX_MODELVIEW_STACK_DEPTH`: UInt = 3382u;
public const val `GL_MAX_NAME_STACK_DEPTH`: UInt = 3383u;
public const val `GL_MAX_PIXEL_MAP_TABLE`: UInt = 3380u;
public const val `GL_MAX_PROJECTION_STACK_DEPTH`: UInt = 3384u;
public const val `GL_MAX_TEXTURE_SIZE`: UInt = 3379u;
public const val `GL_MAX_TEXTURE_STACK_DEPTH`: UInt = 3385u;
public const val `GL_MAX_VIEWPORT_DIMS`: UInt = 3386u;
public const val `GL_MODELVIEW`: UInt = 5888u;
public const val `GL_MODELVIEW_MATRIX`: UInt = 2982u;
public const val `GL_MODELVIEW_STACK_DEPTH`: UInt = 2979u;
public const val `GL_MODULATE`: UInt = 8448u;
public const val `GL_MULT`: UInt = 259u;
public const val `GL_N3F_V3F`: UInt = 10789u;
public const val `GL_NAME_STACK_DEPTH`: UInt = 3440u;
public const val `GL_NAND`: UInt = 5390u;
public const val `GL_NEAREST`: UInt = 9728u;
public const val `GL_NEAREST_MIPMAP_LINEAR`: UInt = 9986u;
public const val `GL_NEAREST_MIPMAP_NEAREST`: UInt = 9984u;
public const val `GL_NEVER`: UInt = 512u;
public const val `GL_NICEST`: UInt = 4354u;
public const val `GL_NONE`: UInt = 0u;
public const val `GL_NOOP`: UInt = 5381u;
public const val `GL_NOR`: UInt = 5384u;
public const val `GL_NORMALIZE`: UInt = 2977u;
public const val `GL_NORMAL_ARRAY`: UInt = 32885u;
public const val `GL_NORMAL_ARRAY_COUNT_EXT`: UInt = 32896u;
public const val `GL_NORMAL_ARRAY_EXT`: UInt = 32885u;
public const val `GL_NORMAL_ARRAY_POINTER`: UInt = 32911u;
public const val `GL_NORMAL_ARRAY_POINTER_EXT`: UInt = 32911u;
public const val `GL_NORMAL_ARRAY_STRIDE`: UInt = 32895u;
public const val `GL_NORMAL_ARRAY_STRIDE_EXT`: UInt = 32895u;
public const val `GL_NORMAL_ARRAY_TYPE`: UInt = 32894u;
public const val `GL_NORMAL_ARRAY_TYPE_EXT`: UInt = 32894u;
public const val `GL_NOTEQUAL`: UInt = 517u;
public const val `GL_NO_ERROR`: UInt = 0u;
public const val `GL_OBJECT_LINEAR`: UInt = 9217u;
public const val `GL_OBJECT_PLANE`: UInt = 9473u;
public const val `GL_ONE`: UInt = 1u;
public const val `GL_ONE_MINUS_DST_ALPHA`: UInt = 773u;
public const val `GL_ONE_MINUS_DST_COLOR`: UInt = 775u;
public const val `GL_ONE_MINUS_SRC_ALPHA`: UInt = 771u;
public const val `GL_ONE_MINUS_SRC_COLOR`: UInt = 769u;
public const val `GL_OR`: UInt = 5383u;
public const val `GL_ORDER`: UInt = 2561u;
public const val `GL_OR_INVERTED`: UInt = 5389u;
public const val `GL_OR_REVERSE`: UInt = 5387u;
public const val `GL_OUT_OF_MEMORY`: UInt = 1285u;
public const val `GL_PACK_ALIGNMENT`: UInt = 3333u;
public const val `GL_PACK_LSB_FIRST`: UInt = 3329u;
public const val `GL_PACK_ROW_LENGTH`: UInt = 3330u;
public const val `GL_PACK_SKIP_PIXELS`: UInt = 3332u;
public const val `GL_PACK_SKIP_ROWS`: UInt = 3331u;
public const val `GL_PACK_SWAP_BYTES`: UInt = 3328u;
public const val `GL_PASS_THROUGH_TOKEN`: UInt = 1792u;
public const val `GL_PERSPECTIVE_CORRECTION_HINT`: UInt = 3152u;
public const val `GL_PHONG_HINT_WIN`: UInt = 33003u;
public const val `GL_PHONG_WIN`: UInt = 33002u;
public const val `GL_PIXEL_MAP_A_TO_A`: UInt = 3193u;
public const val `GL_PIXEL_MAP_A_TO_A_SIZE`: UInt = 3257u;
public const val `GL_PIXEL_MAP_B_TO_B`: UInt = 3192u;
public const val `GL_PIXEL_MAP_B_TO_B_SIZE`: UInt = 3256u;
public const val `GL_PIXEL_MAP_G_TO_G`: UInt = 3191u;
public const val `GL_PIXEL_MAP_G_TO_G_SIZE`: UInt = 3255u;
public const val `GL_PIXEL_MAP_I_TO_A`: UInt = 3189u;
public const val `GL_PIXEL_MAP_I_TO_A_SIZE`: UInt = 3253u;
public const val `GL_PIXEL_MAP_I_TO_B`: UInt = 3188u;
public const val `GL_PIXEL_MAP_I_TO_B_SIZE`: UInt = 3252u;
public const val `GL_PIXEL_MAP_I_TO_G`: UInt = 3187u;
public const val `GL_PIXEL_MAP_I_TO_G_SIZE`: UInt = 3251u;
public const val `GL_PIXEL_MAP_I_TO_I`: UInt = 3184u;
public const val `GL_PIXEL_MAP_I_TO_I_SIZE`: UInt = 3248u;
public const val `GL_PIXEL_MAP_I_TO_R`: UInt = 3186u;
public const val `GL_PIXEL_MAP_I_TO_R_SIZE`: UInt = 3250u;
public const val `GL_PIXEL_MAP_R_TO_R`: UInt = 3190u;
public const val `GL_PIXEL_MAP_R_TO_R_SIZE`: UInt = 3254u;
public const val `GL_PIXEL_MAP_S_TO_S`: UInt = 3185u;
public const val `GL_PIXEL_MAP_S_TO_S_SIZE`: UInt = 3249u;
public const val `GL_PIXEL_MODE_BIT`: UInt = 32u;
public const val `GL_POINT`: UInt = 6912u;
public const val `GL_POINTS`: UInt = 0u;
public const val `GL_POINT_BIT`: UInt = 2u;
public const val `GL_POINT_SIZE`: UInt = 2833u;
public const val `GL_POINT_SIZE_GRANULARITY`: UInt = 2835u;
public const val `GL_POINT_SIZE_RANGE`: UInt = 2834u;
public const val `GL_POINT_SMOOTH`: UInt = 2832u;
public const val `GL_POINT_SMOOTH_HINT`: UInt = 3153u;
public const val `GL_POINT_TOKEN`: UInt = 1793u;
public const val `GL_POLYGON`: UInt = 9u;
public const val `GL_POLYGON_BIT`: UInt = 8u;
public const val `GL_POLYGON_MODE`: UInt = 2880u;
public const val `GL_POLYGON_OFFSET_FACTOR`: UInt = 32824u;
public const val `GL_POLYGON_OFFSET_FILL`: UInt = 32823u;
public const val `GL_POLYGON_OFFSET_LINE`: UInt = 10754u;
public const val `GL_POLYGON_OFFSET_POINT`: UInt = 10753u;
public const val `GL_POLYGON_OFFSET_UNITS`: UInt = 10752u;
public const val `GL_POLYGON_SMOOTH`: UInt = 2881u;
public const val `GL_POLYGON_SMOOTH_HINT`: UInt = 3155u;
public const val `GL_POLYGON_STIPPLE`: UInt = 2882u;
public const val `GL_POLYGON_STIPPLE_BIT`: UInt = 16u;
public const val `GL_POLYGON_TOKEN`: UInt = 1795u;
public const val `GL_POSITION`: UInt = 4611u;
public const val `GL_PROJECTION`: UInt = 5889u;
public const val `GL_PROJECTION_MATRIX`: UInt = 2983u;
public const val `GL_PROJECTION_STACK_DEPTH`: UInt = 2980u;
public const val `GL_PROXY_TEXTURE_1D`: UInt = 32867u;
public const val `GL_PROXY_TEXTURE_2D`: UInt = 32868u;
public const val `GL_Q`: UInt = 8195u;
public const val `GL_QUADRATIC_ATTENUATION`: UInt = 4617u;
public const val `GL_QUADS`: UInt = 7u;
public const val `GL_QUAD_STRIP`: UInt = 8u;
public const val `GL_R`: UInt = 8194u;
public const val `GL_R3_G3_B2`: UInt = 10768u;
public const val `GL_READ_BUFFER`: UInt = 3074u;
public const val `GL_RED`: UInt = 6403u;
public const val `GL_RED_BIAS`: UInt = 3349u;
public const val `GL_RED_BITS`: UInt = 3410u;
public const val `GL_RED_SCALE`: UInt = 3348u;
public const val `GL_RENDER`: UInt = 7168u;
public const val `GL_RENDERER`: UInt = 7937u;
public const val `GL_RENDER_MODE`: UInt = 3136u;
public const val `GL_REPEAT`: UInt = 10497u;
public const val `GL_REPLACE`: UInt = 7681u;
public const val `GL_RETURN`: UInt = 258u;
public const val `GL_RGB`: UInt = 6407u;
public const val `GL_RGB10`: UInt = 32850u;
public const val `GL_RGB10_A2`: UInt = 32857u;
public const val `GL_RGB12`: UInt = 32851u;
public const val `GL_RGB16`: UInt = 32852u;
public const val `GL_RGB4`: UInt = 32847u;
public const val `GL_RGB5`: UInt = 32848u;
public const val `GL_RGB5_A1`: UInt = 32855u;
public const val `GL_RGB8`: UInt = 32849u;
public const val `GL_RGBA`: UInt = 6408u;
public const val `GL_RGBA12`: UInt = 32858u;
public const val `GL_RGBA16`: UInt = 32859u;
public const val `GL_RGBA2`: UInt = 32853u;
public const val `GL_RGBA4`: UInt = 32854u;
public const val `GL_RGBA8`: UInt = 32856u;
public const val `GL_RGBA_MODE`: UInt = 3121u;
public const val `GL_RIGHT`: UInt = 1031u;
public const val `GL_S`: UInt = 8192u;
public const val `GL_SCISSOR_BIT`: UInt = 524288u;
public const val `GL_SCISSOR_BOX`: UInt = 3088u;
public const val `GL_SCISSOR_TEST`: UInt = 3089u;
public const val `GL_SELECT`: UInt = 7170u;
public const val `GL_SELECTION_BUFFER_POINTER`: UInt = 3571u;
public const val `GL_SELECTION_BUFFER_SIZE`: UInt = 3572u;
public const val `GL_SET`: UInt = 5391u;
public const val `GL_SHADE_MODEL`: UInt = 2900u;
public const val `GL_SHININESS`: UInt = 5633u;
public const val `GL_SHORT`: UInt = 5122u;
public const val `GL_SMOOTH`: UInt = 7425u;
public const val `GL_SPECULAR`: UInt = 4610u;
public const val `GL_SPHERE_MAP`: UInt = 9218u;
public const val `GL_SPOT_CUTOFF`: UInt = 4614u;
public const val `GL_SPOT_DIRECTION`: UInt = 4612u;
public const val `GL_SPOT_EXPONENT`: UInt = 4613u;
public const val `GL_SRC_ALPHA`: UInt = 770u;
public const val `GL_SRC_ALPHA_SATURATE`: UInt = 776u;
public const val `GL_SRC_COLOR`: UInt = 768u;
public const val `GL_STACK_OVERFLOW`: UInt = 1283u;
public const val `GL_STACK_UNDERFLOW`: UInt = 1284u;
public const val `GL_STENCIL`: UInt = 6146u;
public const val `GL_STENCIL_BITS`: UInt = 3415u;
public const val `GL_STENCIL_BUFFER_BIT`: UInt = 1024u;
public const val `GL_STENCIL_CLEAR_VALUE`: UInt = 2961u;
public const val `GL_STENCIL_FAIL`: UInt = 2964u;
public const val `GL_STENCIL_FUNC`: UInt = 2962u;
public const val `GL_STENCIL_INDEX`: UInt = 6401u;
public const val `GL_STENCIL_PASS_DEPTH_FAIL`: UInt = 2965u;
public const val `GL_STENCIL_PASS_DEPTH_PASS`: UInt = 2966u;
public const val `GL_STENCIL_REF`: UInt = 2967u;
public const val `GL_STENCIL_TEST`: UInt = 2960u;
public const val `GL_STENCIL_VALUE_MASK`: UInt = 2963u;
public const val `GL_STENCIL_WRITEMASK`: UInt = 2968u;
public const val `GL_STEREO`: UInt = 3123u;
public const val `GL_SUBPIXEL_BITS`: UInt = 3408u;
public const val `GL_T`: UInt = 8193u;
public const val `GL_T2F_C3F_V3F`: UInt = 10794u;
public const val `GL_T2F_C4F_N3F_V3F`: UInt = 10796u;
public const val `GL_T2F_C4UB_V3F`: UInt = 10793u;
public const val `GL_T2F_N3F_V3F`: UInt = 10795u;
public const val `GL_T2F_V3F`: UInt = 10791u;
public const val `GL_T4F_C4F_N3F_V4F`: UInt = 10797u;
public const val `GL_T4F_V4F`: UInt = 10792u;
public const val `GL_TEXTURE`: UInt = 5890u;
public const val `GL_TEXTURE_1D`: UInt = 3552u;
public const val `GL_TEXTURE_2D`: UInt = 3553u;
public const val `GL_TEXTURE_ALPHA_SIZE`: UInt = 32863u;
public const val `GL_TEXTURE_BINDING_1D`: UInt = 32872u;
public const val `GL_TEXTURE_BINDING_2D`: UInt = 32873u;
public const val `GL_TEXTURE_BIT`: UInt = 262144u;
public const val `GL_TEXTURE_BLUE_SIZE`: UInt = 32862u;
public const val `GL_TEXTURE_BORDER`: UInt = 4101u;
public const val `GL_TEXTURE_BORDER_COLOR`: UInt = 4100u;
public const val `GL_TEXTURE_COMPONENTS`: UInt = 4099u;
public const val `GL_TEXTURE_COORD_ARRAY`: UInt = 32888u;
public const val `GL_TEXTURE_COORD_ARRAY_COUNT_EXT`: UInt = 32907u;
public const val `GL_TEXTURE_COORD_ARRAY_EXT`: UInt = 32888u;
public const val `GL_TEXTURE_COORD_ARRAY_POINTER`: UInt = 32914u;
public const val `GL_TEXTURE_COORD_ARRAY_POINTER_EXT`: UInt = 32914u;
public const val `GL_TEXTURE_COORD_ARRAY_SIZE`: UInt = 32904u;
public const val `GL_TEXTURE_COORD_ARRAY_SIZE_EXT`: UInt = 32904u;
public const val `GL_TEXTURE_COORD_ARRAY_STRIDE`: UInt = 32906u;
public const val `GL_TEXTURE_COORD_ARRAY_STRIDE_EXT`: UInt = 32906u;
public const val `GL_TEXTURE_COORD_ARRAY_TYPE`: UInt = 32905u;
public const val `GL_TEXTURE_COORD_ARRAY_TYPE_EXT`: UInt = 32905u;
public const val `GL_TEXTURE_ENV`: UInt = 8960u;
public const val `GL_TEXTURE_ENV_COLOR`: UInt = 8705u;
public const val `GL_TEXTURE_ENV_MODE`: UInt = 8704u;
public const val `GL_TEXTURE_GEN_MODE`: UInt = 9472u;
public const val `GL_TEXTURE_GEN_Q`: UInt = 3171u;
public const val `GL_TEXTURE_GEN_R`: UInt = 3170u;
public const val `GL_TEXTURE_GEN_S`: UInt = 3168u;
public const val `GL_TEXTURE_GEN_T`: UInt = 3169u;
public const val `GL_TEXTURE_GREEN_SIZE`: UInt = 32861u;
public const val `GL_TEXTURE_HEIGHT`: UInt = 4097u;
public const val `GL_TEXTURE_INTENSITY_SIZE`: UInt = 32865u;
public const val `GL_TEXTURE_INTERNAL_FORMAT`: UInt = 4099u;
public const val `GL_TEXTURE_LUMINANCE_SIZE`: UInt = 32864u;
public const val `GL_TEXTURE_MAG_FILTER`: UInt = 10240u;
public const val `GL_TEXTURE_MATRIX`: UInt = 2984u;
public const val `GL_TEXTURE_MIN_FILTER`: UInt = 10241u;
public const val `GL_TEXTURE_PRIORITY`: UInt = 32870u;
public const val `GL_TEXTURE_RED_SIZE`: UInt = 32860u;
public const val `GL_TEXTURE_RESIDENT`: UInt = 32871u;
public const val `GL_TEXTURE_STACK_DEPTH`: UInt = 2981u;
public const val `GL_TEXTURE_WIDTH`: UInt = 4096u;
public const val `GL_TEXTURE_WRAP_S`: UInt = 10242u;
public const val `GL_TEXTURE_WRAP_T`: UInt = 10243u;
public const val `GL_TRANSFORM_BIT`: UInt = 4096u;
public const val `GL_TRIANGLES`: UInt = 4u;
public const val `GL_TRIANGLE_FAN`: UInt = 6u;
public const val `GL_TRIANGLE_STRIP`: UInt = 5u;
public const val `GL_TRUE`: UInt = 1u;
public const val `GL_UNPACK_ALIGNMENT`: UInt = 3317u;
public const val `GL_UNPACK_LSB_FIRST`: UInt = 3313u;
public const val `GL_UNPACK_ROW_LENGTH`: UInt = 3314u;
public const val `GL_UNPACK_SKIP_PIXELS`: UInt = 3316u;
public const val `GL_UNPACK_SKIP_ROWS`: UInt = 3315u;
public const val `GL_UNPACK_SWAP_BYTES`: UInt = 3312u;
public const val `GL_UNSIGNED_BYTE`: UInt = 5121u;
public const val `GL_UNSIGNED_INT`: UInt = 5125u;
public const val `GL_UNSIGNED_SHORT`: UInt = 5123u;
public const val `GL_V2F`: UInt = 10784u;
public const val `GL_V3F`: UInt = 10785u;
public const val `GL_VENDOR`: UInt = 7936u;
public const val `GL_VERSION`: UInt = 7938u;
public const val `GL_VERSION_1_1`: UInt = 1u;
public const val `GL_VERTEX_ARRAY`: UInt = 32884u;
public const val `GL_VERTEX_ARRAY_COUNT_EXT`: UInt = 32893u;
public const val `GL_VERTEX_ARRAY_EXT`: UInt = 32884u;
public const val `GL_VERTEX_ARRAY_POINTER`: UInt = 32910u;
public const val `GL_VERTEX_ARRAY_POINTER_EXT`: UInt = 32910u;
public const val `GL_VERTEX_ARRAY_SIZE`: UInt = 32890u;
public const val `GL_VERTEX_ARRAY_SIZE_EXT`: UInt = 32890u;
public const val `GL_VERTEX_ARRAY_STRIDE`: UInt = 32892u;
public const val `GL_VERTEX_ARRAY_STRIDE_EXT`: UInt = 32892u;
public const val `GL_VERTEX_ARRAY_TYPE`: UInt = 32891u;
public const val `GL_VERTEX_ARRAY_TYPE_EXT`: UInt = 32891u;
public const val `GL_VIEWPORT`: UInt = 2978u;
public const val `GL_VIEWPORT_BIT`: UInt = 2048u;
public const val `GL_WIN_draw_range_elements`: UInt = 1u;
public const val `GL_WIN_swap_hint`: UInt = 1u;
public const val `GL_XOR`: UInt = 5382u;
public const val `GL_ZERO`: UInt = 0u;
public const val `GL_ZOOM_X`: UInt = 3350u;
public const val `GL_ZOOM_Y`: UInt = 3351u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HGLRC` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LAYERPLANEDESCRIPTOR` (
    public var `nSize`: UShort,
    public var `nVersion`: UShort,
    public var `dwFlags`: UInt,
    public var `iPixelType`: UByte,
    public var `cColorBits`: UByte,
    public var `cRedBits`: UByte,
    public var `cRedShift`: UByte,
    public var `cGreenBits`: UByte,
    public var `cGreenShift`: UByte,
    public var `cBlueBits`: UByte,
    public var `cBlueShift`: UByte,
    public var `cAlphaBits`: UByte,
    public var `cAlphaShift`: UByte,
    public var `cAccumBits`: UByte,
    public var `cAccumRedBits`: UByte,
    public var `cAccumGreenBits`: UByte,
    public var `cAccumBlueBits`: UByte,
    public var `cAccumAlphaBits`: UByte,
    public var `cDepthBits`: UByte,
    public var `cStencilBits`: UByte,
    public var `cAuxBuffers`: UByte,
    public var `iLayerPlane`: UByte,
    public var `bReserved`: UByte,
    public var `crTransparent`: `super`.`super`.`Foundation`.`COLORREF`,
)
public const val `PFD_DEPTH_DONTCARE`: `PFD_FLAGS` = 536870912u;
public const val `PFD_DIRECT3D_ACCELERATED`: `PFD_FLAGS` = 16384u;
public const val `PFD_DOUBLEBUFFER`: `PFD_FLAGS` = 1u;
public const val `PFD_DOUBLEBUFFER_DONTCARE`: `PFD_FLAGS` = 1073741824u;
public const val `PFD_DRAW_TO_BITMAP`: `PFD_FLAGS` = 8u;
public const val `PFD_DRAW_TO_WINDOW`: `PFD_FLAGS` = 4u;
public typealias `PFD_FLAGS` = UInt;
public const val `PFD_GENERIC_ACCELERATED`: `PFD_FLAGS` = 4096u;
public const val `PFD_GENERIC_FORMAT`: `PFD_FLAGS` = 64u;
public typealias `PFD_LAYER_TYPE` = Byte;
public const val `PFD_MAIN_PLANE`: `PFD_LAYER_TYPE` = 0;
public const val `PFD_NEED_PALETTE`: `PFD_FLAGS` = 128u;
public const val `PFD_NEED_SYSTEM_PALETTE`: `PFD_FLAGS` = 256u;
public const val `PFD_OVERLAY_PLANE`: `PFD_LAYER_TYPE` = 1;
public typealias `PFD_PIXEL_TYPE` = UByte;
public const val `PFD_STEREO`: `PFD_FLAGS` = 2u;
public const val `PFD_STEREO_DONTCARE`: `PFD_FLAGS` = 2147483648u;
public const val `PFD_SUPPORT_COMPOSITION`: `PFD_FLAGS` = 32768u;
public const val `PFD_SUPPORT_DIRECTDRAW`: `PFD_FLAGS` = 8192u;
public const val `PFD_SUPPORT_GDI`: `PFD_FLAGS` = 16u;
public const val `PFD_SUPPORT_OPENGL`: `PFD_FLAGS` = 32u;
public const val `PFD_SWAP_COPY`: `PFD_FLAGS` = 1024u;
public const val `PFD_SWAP_EXCHANGE`: `PFD_FLAGS` = 512u;
public const val `PFD_SWAP_LAYER_BUFFERS`: `PFD_FLAGS` = 2048u;
public const val `PFD_TYPE_COLORINDEX`: `PFD_PIXEL_TYPE` = 1u;
public const val `PFD_TYPE_RGBA`: `PFD_PIXEL_TYPE` = 0u;
public const val `PFD_UNDERLAY_PLANE`: `PFD_LAYER_TYPE` = -1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLADDSWAPHINTRECTWINPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, Int, Int, Int) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLARRAYELEMENTARRAYEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLARRAYELEMENTEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLCOLORPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, UInt, Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLCOLORSUBTABLEEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int, Int, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLCOLORTABLEEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, Int, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLDRAWARRAYSEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int, Int) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLDRAWRANGEELEMENTSWINPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, Int, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLEDGEFLAGPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLGETCOLORTABLEEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLGETCOLORTABLEPARAMETERFVEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLGETCOLORTABLEPARAMETERIVEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLGETPOINTERVEXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLINDEXPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLNORMALPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLTEXCOORDPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, UInt, Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNGLVERTEXPOINTEREXTPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(Int, UInt, Int, Int, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PIXELFORMATDESCRIPTOR` (
    public var `nSize`: UShort,
    public var `nVersion`: UShort,
    public var `dwFlags`: `PFD_FLAGS`,
    public var `iPixelType`: `PFD_PIXEL_TYPE`,
    public var `cColorBits`: UByte,
    public var `cRedBits`: UByte,
    public var `cRedShift`: UByte,
    public var `cGreenBits`: UByte,
    public var `cGreenShift`: UByte,
    public var `cBlueBits`: UByte,
    public var `cBlueShift`: UByte,
    public var `cAlphaBits`: UByte,
    public var `cAlphaShift`: UByte,
    public var `cAccumBits`: UByte,
    public var `cAccumRedBits`: UByte,
    public var `cAccumGreenBits`: UByte,
    public var `cAccumBlueBits`: UByte,
    public var `cAccumAlphaBits`: UByte,
    public var `cDepthBits`: UByte,
    public var `cStencilBits`: UByte,
    public var `cAuxBuffers`: UByte,
    public var `iLayerType`: UByte,
    public var `bReserved`: UByte,
    public var `dwLayerMask`: UInt,
    public var `dwVisibleMask`: UInt,
    public var `dwDamageMask`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `POINTFLOAT` (
    public var `x`: Float,
    public var `y`: Float,
)
