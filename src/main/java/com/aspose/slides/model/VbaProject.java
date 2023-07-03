/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides.model;

import java.util.Objects;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.VbaReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * VBA project
 */
@ApiModel(description = "VBA project")
public class VbaProject extends ResourceBase {
  @SerializedName(value = "modules", alternate = { "Modules" })
  private List<ResourceUri> modules = null;

  @SerializedName(value = "references", alternate = { "References" })
  private List<VbaReference> references = null;


  public VbaProject() {
    super();
  }

  public VbaProject modules(List<ResourceUri> modules) {
    this.modules = modules;
    return this;
  }

  public VbaProject addModulesItem(ResourceUri modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<ResourceUri>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * VBA modules
   * @return modules
  **/
  @ApiModelProperty(value = "VBA modules")
  public List<ResourceUri> getModules() {
    return modules;
  }

  public void setModules(List<ResourceUri> modules) {
    this.modules = modules;
  }

  public VbaProject references(List<VbaReference> references) {
    this.references = references;
    return this;
  }

  public VbaProject addReferencesItem(VbaReference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<VbaReference>();
    }
    this.references.add(referencesItem);
    return this;
  }

   /**
   * VBA references
   * @return references
  **/
  @ApiModelProperty(value = "VBA references")
  public List<VbaReference> getReferences() {
    return references;
  }

  public void setReferences(List<VbaReference> references) {
    this.references = references;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbaProject vbaProject = (VbaProject) o;
    return true && Objects.equals(this.modules, vbaProject.modules) && Objects.equals(this.references, vbaProject.references) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modules, references, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbaProject {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }



  private static final Map<String, Object> typeDeterminers = new Hashtable<String, Object>();

}
